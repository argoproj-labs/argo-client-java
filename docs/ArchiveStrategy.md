

# ArchiveStrategy

ArchiveStrategy describes how to archive files/directory when saving artifacts
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**none** | [**Object**](.md) | NoneStrategy indicates to skip tar process and upload the files or directory tree as independent files. Note that if the artifact is a directory, the artifact driver must support the ability to save/load the directory appropriately. |  [optional]
**tar** | [**TarStrategy**](TarStrategy.md) |  |  [optional]
**zip** | [**Object**](.md) | ZipStrategy will unzip zipped input artifacts |  [optional]



