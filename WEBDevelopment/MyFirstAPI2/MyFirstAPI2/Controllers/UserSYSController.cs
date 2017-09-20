using System;
using System.Collections.Generic;
using System.Data;
using System.Data.Entity;
using System.Data.Entity.Infrastructure;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;
using System.Web.Http.Description;
using MyFirstAPI2;
using MyFirstAPI2.Models;

namespace MyFirstAPI2.Controllers
{
    public class UserSYSController : ApiController
    {
        private Contexto db = new Contexto();

        // GET: api/UserSYS
        public IQueryable<UserSYS> GetUsers()
        {
            return db.Users;
        }

        public IQueryable<UserSYS> RetorneEspefico()
        {
            return db.Users.Where(Usuario => Usuario.Nome == "SDFSDFSDFSDF");
        }

        // GET: api/UserSYS/5
        [ResponseType(typeof(UserSYS))]
        public IHttpActionResult GetUserSYS(int id)
        {
            UserSYS userSYS = db.Users.Find(id);
            if (userSYS == null)
            {
                return NotFound();
            }

            return Ok(userSYS);
        }

        // PUT: api/UserSYS/5
        [ResponseType(typeof(void))]
        public IHttpActionResult PutUserSYS(int id, UserSYS userSYS)
        {
            if (!ModelState.IsValid)
            {
                return BadRequest(ModelState);
            }

            if (id != userSYS.Id)
            {
                return BadRequest();
            }

            db.Entry(userSYS).State = EntityState.Modified;

            try
            {
                db.SaveChanges();
            }
            catch (DbUpdateConcurrencyException)
            {
                if (!UserSYSExists(id))
                {
                    return NotFound();
                }
                else
                {
                    throw;
                }
            }

            return StatusCode(HttpStatusCode.NoContent);
        }

        // POST: api/UserSYS
        [ResponseType(typeof(UserSYS))]
        public IHttpActionResult PostUserSYS(UserSYS userSYS)
        {
            if (!ModelState.IsValid)
            {
                return BadRequest(ModelState);
            }

            db.Users.Add(userSYS);
            db.SaveChanges();

            return CreatedAtRoute("DefaultApi", new { id = userSYS.Id }, userSYS);
        }

        // DELETE: api/UserSYS/5
        [ResponseType(typeof(UserSYS))]
        public IHttpActionResult DeleteUserSYS(int id)
        {
            UserSYS userSYS = db.Users.Find(id);
            if (userSYS == null)
            {
                return NotFound();
            }

            db.Users.Remove(userSYS);
            db.SaveChanges();

            return Ok(userSYS);
        }

        protected override void Dispose(bool disposing)
        {
            if (disposing)
            {
                db.Dispose();
            }
            base.Dispose(disposing);
        }

        private bool UserSYSExists(int id)
        {
            return db.Users.Count(e => e.Id == id) > 0;
        }
    }
}