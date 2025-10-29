package CC.Encycloped.Abs.Scal.Gom;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Util.By.Get_Q_By_Q;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import java.util.ArrayList;

public class Box<Vectr_Typ extends Get_Q_By_Q>
{
	public static final Clas_Rap Class=Init_StRt(Box.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public Box(Box StM,double[] StRtg,double[] Ndg)
	{
		this.StM=StM;

		this.StRtg=StRtg;
		this.Ndg=Ndg;
	}

	public Box StM;

	public double[] StRtg;
	public double[] Ndg;
	public ArrayList<Vectr_Typ> Vectrg=new ArrayList<>();

	public ArrayList<Object> Branchg=new ArrayList<>();

	static{Init_Nd(Box.class);}
}