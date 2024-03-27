

# ChangeJobAdministrativeDetailsDataF8f20079bc5a1000089ccb7f6a8800eaAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payRateType** | [**PayRateTypeD25283821c01100016756a14eb650000**](PayRateTypeD25283821c01100016756a14eb650000.md) |  |  [optional] |
|**workersCompensationCodeOverride** | [**WorkersCompensationCodeOverride05d4c45042b61000138500e185e0013f**](WorkersCompensationCodeOverride05d4c45042b61000138500e185e0013f.md) |  |  [optional] |
|**fte** | **Integer** | Full Time Equivalent for a worker calculated by scheduled weekly hours divided by default weekly hours either current or proposed. |  [optional] |
|**notifyBy** | **LocalDate** | Returns the date that the employee should be notified for a termination. |  [optional] |
|**companyInsiderTypes** | [**List&lt;ChangeJobCompanyInsiderTypesData05d4c45042b61000131e4b2132f30137&gt;**](ChangeJobCompanyInsiderTypesData05d4c45042b61000131e4b2132f30137.md) | The new company insider types for the worker as of the effective date. |  [optional] |
|**firstDayOfWork** | **LocalDate** | The first day of work for the worker, as specified on the Hire, Add International Assignment, or Add Job transaction. This field will not return a value for any other transaction. |  [optional] |
|**defaultWeeklyHours** | **Integer** | The new default weekly hours for the worker as of the effective date. |  [optional] |
|**positionWorkerType** | [**PositionWorkerType05d4c45042b610001030ee47f2c90118**](PositionWorkerType05d4c45042b610001030ee47f2c90118.md) |  |  [optional] |
|**workingFte** | **Integer** | The working full time equivalent for the worker as of the effective date. |  [optional] |
|**specifyWorkingFte** | **Boolean** | True if working full time equivalent is specified on a worker as of the effective date. |  [optional] |
|**timeType** | [**TimeType05d4c45042b610000bb540b7458e0108**](TimeType05d4c45042b610000bb540b7458e0108.md) |  |  [optional] |
|**specifyPaidFte** | **Boolean** | True if paid full time equivalent is specified on a worker as of the effective date. |  [optional] |
|**paidFte** | **Integer** | The paid full time equivalent for the worker as of the effective date. |  [optional] |
|**workStudy** | [**WorkStudy05d4c45042b610000ba2f83c70f30101**](WorkStudy05d4c45042b610000ba2f83c70f30101.md) |  |  [optional] |
|**assignmentType** | [**AssignmentType23929e1f68ca10000d6940d6bde56963**](AssignmentType23929e1f68ca10000d6940d6bde56963.md) |  |  [optional] |
|**endEmploymentDate** | **LocalDate** | The new End Employment Date for the worker. If the worker has an Employee Contract sub event, this field will return that end date instead. |  [optional] |
|**expectedAssignmentEndDate** | **LocalDate** | For a past or current business process, the value of the Expected Assignment End Date field that is being (or was) proposed in the process. |  [optional] |



