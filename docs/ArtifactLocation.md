

# ArtifactLocation

ArtifactLocation describes a location for a single or multiple artifacts. It is used as single artifact in the context of inputs/outputs (e.g. outputs.artifacts.artname). It is also used to describe the location of multiple artifacts such as the archive location of a single workflow step, which the executor will use as a default location to store its files.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archiveLogs** | **Boolean** |  |  [optional]
**artifactory** | [**ArtifactoryArtifact**](ArtifactoryArtifact.md) |  |  [optional]
**gcs** | [**GCSArtifact**](GCSArtifact.md) |  |  [optional]
**git** | [**GitArtifact**](GitArtifact.md) |  |  [optional]
**hdfs** | [**HDFSArtifact**](HDFSArtifact.md) |  |  [optional]
**http** | [**HTTPArtifact**](HTTPArtifact.md) |  |  [optional]
**oss** | [**OSSArtifact**](OSSArtifact.md) |  |  [optional]
**raw** | [**RawArtifact**](RawArtifact.md) |  |  [optional]
**s3** | [**S3Artifact**](S3Artifact.md) |  |  [optional]



