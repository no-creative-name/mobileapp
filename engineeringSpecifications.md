# Engineering Specifications:

## Functionality
### /F0000/ Browsing the overview
The user is able to see all contacts on one page and browse thorugh them. He can directly access a contact and get forwarded to its detail page.
Same goes for companies. Contacts and companies are located in two different lists.

### /F0001/ Adding a new contact
The user can choose to add a new contact. When he does so, he is prompted to type in the contact's first name and last name and whatever additional contact data there is. When he confirms this new contact, it gets added into the contact database.
When he confirms the contact without typing in anything, a warning message appears telling the user to type in any data.
The user can also choose to cancel adding the contact, thereby no contact gets added into the contact database.

### /F0002/ Adding a new company
Same as for /F0002/, but with company name and address.

### /F0003/ Assigning a company to a contact
The user has the option to choose an existing company to assign to a contact either when he is currently creating the contact (/F0001/), or afterwards when editing the contact. (/F0005/)

### /F0004/ Accessing existing contacts
The user can access existing contacts and see all data they typed in when creating them. He can directly access the assigned company and get forwarded to its detail page.

### /F0005/ Editing existing contacts
The user is able to edit contact data of existing contacts. He can remove and alter existing data or add new data to the contact.

### /F0006/ Sorting contacts
The user can sort all contacts in the overview by either first name or last name.

### /F0007/ Accessing existing companies
The user can access existing companies and see all data they typed in when creating them. There's a list in the companies detail page where all contacts are listed, that are assigned to that company. The user can directly access every assigned contact and get forwarded to its detail page.

### /F0008/ Deleting existing contacts
The user can choose one or multiple contacts to delete. He has to confirm the deleting process once. Then contact(s) then get removed from the database.

### /F0009/ Deleting existing companies
The user can choose one or multiple companies to delete. He has to confirm the deleting process once. The user gets asked if he wants to delete all assigned contacts as well. Then companie(s) and optionally the assigned contacts then get removed from the database.

## Data
### Contact data
* Contact ID
* First name
* Last name
* Address
* Country
* Phone number
* Email address
* Assigned company ID

### Company data
* Company ID
* Name
* Address
* Country
* Assigned contact IDs