package CC.Encycloped.Abs.Scal.Gom.D2;

import CC.Encycloped.Abs.Scal.Gom.ROtr_IndX;

public interface ROtr_2 extends ROtr_IndX
{
	@Override default int Dim_Num(){return 2;}

	float AB_Flot();
	double AB_Dubl();
	void Set_AB(float AB);
	void Set_AB(double AB);

	@Override default float Rot_Flot(int A,int B){return (A==0&&B==1)?AB_Flot():0;}
	@Override default double Rot_Dubl(int A,int B){return (A==0&&B==1)?AB_Dubl():0;}
	@Override default void Set_Rot(int A,int B,float Rot){if(A==0&&B==1){Set_AB(Rot);}}
	@Override default void Set_Rot(int A,int B,double Rot){if(A==0&&B==1){Set_AB(Rot);}}

	class ROtr_2_Flot implements CC.Encycloped.Abs.Scal.Gom.D2.ROtr_2
	{
		public ROtr_2_Flot(float AB){Set_AB(AB);}
		public ROtr_2_Flot(){}

		public float AB;
			@Override public float AB_Flot(){return AB;}
			@Override public double AB_Dubl(){return AB;}
			@Override public void Set_AB(float AB){this.AB=AB;}
			@Override public void Set_AB(double AB){Set_AB((float)AB);}

		@Override public float Rot_Flot(int A,int B){return (A==0&&B==1)?AB:0;}
		@Override public double Rot_Dubl(int A,int B){return Rot_Flot(A,B);}
	}
	class ROtr_2_Dubl implements CC.Encycloped.Abs.Scal.Gom.D2.ROtr_2
	{
		public ROtr_2_Dubl(float AB){Set_AB(AB);}
		public ROtr_2_Dubl(){}

		public double AB;
			@Override public float AB_Flot(){return (float)AB;}
			@Override public double AB_Dubl(){return AB;}
			@Override public void Set_AB(float AB){Set_AB((double)AB);}
			@Override public void Set_AB(double AB){this.AB=AB;}
	}
}