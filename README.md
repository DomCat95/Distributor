# Distributor
Progetto universitario, materia: **Web systems design and architecture**
<br><br>
## APSW final project: Smart vending machine
You have to implement a basic version of distributed system similar to the smart vending machines system at ***UniPA*** and ***coffee cApp***.<br>
A set of possible functionalities is reported at the end of the document.<br>
##### The connection between users and machines is managed through a server: <br>when a user connect to a machine the information is sent to a central server, the vending machine periodically request to the server if a user has connected/disconnected and changes its status accordingly.
###### Once you define the architecture and the functionalities of your system describe it using the “General specification form” and send it to me (marco.lacascia@unipa.it). I will reply in a few days accepting the specification or requiring modifications. You have to send your specification at least a week before the exam date.

---

<h3>Basic funcionalities</h3>

<dl>
  <dt>User view</dt>
  <dd>Registration/Add credit/Connect to machine/Disconnect</dd>
  <dt>Vending machine view</dt>
  <dd>Check status(connected/disconnected)/Show products/Sell products</dd>
</dl>

---

<h3>Other functionalities</h3>
<dl>
  <dt>Technician view</dt>
  <dd>Connect to machine/View status/Refill/…</dd>
  <dt>Admin view</dt>
  <dd>Register technicians/Register machines/Manage users/View stats/…</dd>
</dl>
