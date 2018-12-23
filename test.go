import ArrayList
func main () {
	var a int ArrayList
 	var b int
	var c int
	var t1 int
	var s1 <int> Stack
	var q1 <int> Queue
	var m1 int = 2

	s1.pushs(1)
	s1.pushs(2)
	s1.pushs(3)
	q1.pushd(1)
	q1.pushd(2)
	q1.pushd(3)
	write(s1.pop)
	write(s1.pop)
	write(s1.pop)
	write(q1.poll)
	write(q1.poll)
	write(q1.poll)

	t1 = 3
	switch ( t1 ) {
		case 1 : {
			write( 11111 )
		}	 
		case 2 : {
			write( 22222 )
		}
		case 3 : {
			write ( 33333 )
		}
	}

	while ( t1 > 0 ) {
	   m1 = m1 + t1 
	   --t1
	   if ( t1 == 1 ) {
		  break
	   }
	}

	a.add(11111)
    a.add(22222)
    a.add(33333)
    a.add(44444)
    a.get(1) = a.get(1) + 1
    c = a.find(33333)
    a.delete(c)
    b = 0
    for(b < a.size()){
    write(a.get(b))
    ++b
    }
    c = a.find(44444)+1
	write(c)
	

 }

