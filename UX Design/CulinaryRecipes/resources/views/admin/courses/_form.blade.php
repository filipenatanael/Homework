<div class="input-field">
  <input type="text" name="title" value="{{ isset($registry->title) ?  $registry->title : ''}}">
  <label>Title</label>
</div>

<div class="input-field">
  <input type="text" name="description" value="{{ isset($registry->description) ?  $registry->description : ''}}">
  <label>Description</label>
</div>

<div class="input-field">
  <input type="text" name="value" value="{{ isset($registry->value) ?  $registry->value : ''}}">
  <label>Value</label>
</div>

<div class="input-field file-field">
  <div class="btn blue">
    <span>Image</span>
    <input type="file" name="image">
  </div>
  <div class="file-path-wrapper">
    <input type="text" class="file-path validate">
  </div>
</div>

@if(isset($registry->image))
<div class="input-field">
  <img src="{{ asset($registry->image) }}" width="150" />
</div>
@endif

<div>
  <p>
   <input type="checkbox" id="published" name="published" {{isset($registry->published) && $registry->published == 'yes' ? 'checked' : '' }} value="true">
   <label for="published">Published?</label>
  </p>
  <br/><br/>
</div>
