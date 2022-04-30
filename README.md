## Spring app with AWS S3 and React

Use axios

Use React dropzone

Use @CrossOrigin("*") for allowing the React to fetch info from spring

Use DropZone

The "file" name need to be the same in both places

```java 
public void uploadUserProfileImage(@PathVariable("userProfileId") UUID userProfileId,
                                       @RequestParam("file")MultipartFile file){

        userProfileService.uploadUserProfileImage(userProfileId,file);
    }
```

```javascript
function MyDropzone() {
  const onDrop = useCallback(acceptedFiles => {
    const file = acceptedFiles[0];
    console.log(file);
    const formData = new FormData();
    formData.append("file",file)
  }, [])
  const {getRootProps, getInputProps, isDragActive} = useDropzone({onDrop})
```

application.yml has the config for file size# SpringCloudAWS
# SpringCloudAWS
