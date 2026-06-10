== and equals() -> for primitive check value , equals check content , for string x="hello", string y="hello" x==y -> true , .intern() forces pool lookup
(HashMap and Hashtable)-> (threadsafe , not threadsafe) ,(allow null key multiple null values, null key and null values not allowed),()
Collections.synchronizedMap()-> Map<String, String> syncMap = Collections.synchronizedMap(new HashMap<>())- synchronise all  map methd
fail-fast(through concurrent modification exception) vs fail safe iterator , copyonarrayList() and ConcurrentHashMap make it failsafe iterator 
Comparable and Comparator - chaining comparision in comparator
String immutable in Java - thread safety   
Shallow vs deep copy - copy reference , deep copy - copy actual objects
deadlock - threads waiting for resoureces , prevention - remove circualr dependency, use timeout   
ExecutorService - frramework for managing thread
wait and sleep - wait release lock , sleep don't
class immutable - make class final , no setters , deep copy mutable fields  , new instance for any modification
