package ejemplo.security

class Role implements Serializable {

   private static final long serialVersionUID = 1

   String authority

   Role(String authority) {
      this()
      this.authority = authority
   }

   @Override
   int hashCode() {
      authority?.hashCode() ?: 0
   }

   @Override
   boolean equals(other) {
      is(other) || (other instanceof Role && other.authority == authority)
   }

   @Override
   String toString() {
      authority
   }

   static mapping = {
      cache true
   }

   static constraints = {
      authority blank: false, unique: true
   }
}