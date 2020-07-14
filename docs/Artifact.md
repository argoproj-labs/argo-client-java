

# Artifact

Artifact indicates an artifact to place at a specified path
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archive** | [**ArchiveStrategy**](ArchiveStrategy.md) |  |  [optional]
**archiveLogs** | **Boolean** | ArchiveLogs indicates if the container logs should be archived |  [optional]
**artifactory** | [**ArtifactoryArtifact**](ArtifactoryArtifact.md) |  |  [optional]
**from** | **String** | From allows an artifact to reference an artifact from a previous step |  [optional]
**gcs** | [**GCSArtifact**](GCSArtifact.md) |  |  [optional]
**git** | [**GitArtifact**](GitArtifact.md) |  |  [optional]
**globalName** | **String** | GlobalName exports an output artifact to the global scope, making it available as &#39;{{outputs.artifacts.XXXX}} and in workflow.status.outputs.artifacts |  [optional]
**hdfs** | [**HDFSArtifact**](HDFSArtifact.md) |  |  [optional]
**http** | [**HTTPArtifact**](HTTPArtifact.md) |  |  [optional]
**mode** | **Integer** | mode bits to use on this file, must be a value between 0 and 0777 set when loading input artifacts. |  [optional]
**name** | **String** | name of the artifact. must be unique within a template&#39;s inputs/outputs. | 
**optional** | **Boolean** | Make Artifacts optional, if Artifacts doesn&#39;t generate or exist |  [optional]
**oss** | [**OSSArtifact**](OSSArtifact.md) |  |  [optional]
**path** | **String** | Path is the container path to the artifact |  [optional]
**raw** | [**RawArtifact**](RawArtifact.md) |  |  [optional]
**s3** | [**S3Artifact**](S3Artifact.md) |  |  [optional]



