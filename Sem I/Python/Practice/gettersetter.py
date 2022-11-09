# declaring class
class St :

    # declaring constructor
    def __init__(self, fname, lname, address, contact) :
        self.fname = fname
        self.lname = lname
        self.address = address
        self.contact = contact
    
    # declaring getters and setters
    def get_fname(self):
        return self.fname
    
    def set_fname(self, fname):
        self.fname = fname

    def get_lname(self):
        return self.lname
    
    def set_lname(self, lname):
        self.lname = lname

    def get_address(self):
        return self.address
    
    def set_address(self, address):
        self.address = address

    # @property
    # def get_contact(self):
    #     return self.contact

    # @get_contact.setter
    # def set_fname(self, contact):
    #     self.contact = contact

    def get_contact(self):
        return self.contact
    
    def set_contact(self, contact):
        self.contact = contact