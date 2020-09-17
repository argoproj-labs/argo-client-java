

# MutexStatus

MutexStatus contains which objects hold  mutex locks, and which objects this workflow is waiting on to release locks.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**holding** | [**List&lt;MutexHolding&gt;**](MutexHolding.md) | Holding is a list of mutexes and their respective objects that are held by mutex lock for this  |  [optional]
**waiting** | [**List&lt;MutexHolding&gt;**](MutexHolding.md) | Waiting is a list of mutexes and their respective objects this workflow is waiting for. |  [optional]



