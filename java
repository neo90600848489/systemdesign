== and equals() -> for primitive check value , equals check content , for string x="hello", string y="hello" x==y -> true , .intern() forces pool lookup
  Object          ← equals() defined here (reference check)
  └── String    ← overrides equals() (char-by-char check)
  └── Integer   ← overrides equals() (value check)
  └── ArrayList ← overrides equals() (element-by-element check)
  
(HashMap and Hashtable)-> (threadsafe , not threadsafe) ,(allow null key multiple null values, null key and null values not allowed),()
Heap - Young Generation(Eden(initial allocation),S0 and S1(Most Objects die here)) , Old Generation    
Old generation (Tenured) - Cache ,Static,Singleton,Long-lived,Session
HashMap-> get hashcode , calculate bucket index and store data  
Collections.synchronizedMap()-> Map<String, String> syncMap = Collections.synchronizedMap(new HashMap<>())- synchronise all  map methd
fail-fast(through concurrent modification exception) vs fail safe iterator , copyonarrayList() and ConcurrentHashMap make it failsafe iterator 
Comparable and Comparator - chaining comparision in comparator
String immutable in Java - thread safety   
Shallow vs deep copy - copy reference , deep copy - copy actual objects
deadlock - threads waiting for resoureces , prevention - remove circualr dependency, use timeout   
ExecutorService - frramework for managing thread
wait and sleep - wait release lock , sleep don't
no of threads - cpu bound task - (core+1), i/o bound task -  N_cores × (1 + Wait_time / Compute_time) , Mixed/uncertain? Start small, monitor performance, and adjust.
  
class immutable - make class final , no setters , deep copy mutable fields  , new instance for any modification


