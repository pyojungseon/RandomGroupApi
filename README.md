# RandomGroupApi
RandomGroup RESTFul API

### API Requirements
1. Get all persons.
2. Add a person.
  2.1 The name of the user shall be unique.
  2.2 The name of the user shall be between 3 and 12 characters.
3. Delete a person.
4. Divide people into groups randomly.
  4.1 The user shall specify the number and minimum size of the groups.
  4.2 The total number of people in the groups shall match the number of people.
  4.3 The size of a group should be random but it has to satisfy the minimum size of a group.

### Data Model
- Person
  - name: string

- Group
  - name: string
  - persons: person[]
