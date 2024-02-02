package Java101;

public class FindTheAcceleration {

	public static void main(String[] args) {
	//Declare the variable type integer
		//INPUT
		//Declare the the values of initial and final of the velocity  which will use to find the delta velocity
		int velocity_i;
		int velocity_f;
		//Declare the the values of initial and final of the time  which will use to find the delta time
		 int time_i;
		 int time_f;
		 //Declare the delta of velocity and delta of time
		 int del_time;
		 int del_vel;
		 
		 //Declare the Acceleration value which will store the result(m/s2)
		 int Acc;
		 
		 
		 
		 // initialization the values
		 //initialization the values values of initial and final of the velocity in m/s
		 velocity_i=40;
		 velocity_f=100;
		 //initialization the values values of initial and final of the time in s
		 time_i=2;
		 time_f=4;
		 
		 //PROCESS
		 
		 //find the  value of delta velocity
		 del_vel=velocity_f-velocity_i;
		 
		 //find the value of delta time
		 del_time=time_f-time_i;
		 
		 //find the value of Acceleration
		 Acc=del_vel/del_time;
		 
		 //OUTPUT
		 // print the result of acceleration
		 System.out.println("The acceleration = "+Acc);
		 
		 
		 
		 
		 
		

	}

}
