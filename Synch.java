
class Call {
	void call(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}
}

class Caller implements Runnable {
	String msg;
	Call target;
	Thread t;

	public Caller(Call targ, String s) {
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}

	public void run() {
		target.call(msg);

	}
}

class Synch {
	public static void main(String args[]) {
		Call target = new Call();
		Caller ob1 = new Caller(target, "NFSU");
		Caller ob2 = new Caller(target, "Dharwad");
		Caller ob3 = new Caller(target, "Karnataka");

		// wait for threads to end
		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
}