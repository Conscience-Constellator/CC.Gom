package CC.Encycloped.Abs.Scal.Gom.Scrut.Bord_;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.CCPL.Fun.Object.Chek.Condition;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.CCPL.Fun.Object.Chek.Cond_Object;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.Math.Line;
import CC.Math.Slider;

public class Bordr_LMNt extends Cond_Object
{
	public static final Clas_Rap Class=Init_StRt(Bordr_LMNt.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public Bordr_LMNt(Slider Srf,Boolean Dir)
	{
		this.Srf=Srf;
		this.Dir=Dir;
	}
	public Bordr_LMNt(Slider Srf)
	{
		this.Srf=Srf;
		this.Dir=false;
	}
	public Bordr_LMNt(Line Lin,Double Srf,Boolean Dir)
	{
		this.Srf=new Slider(Lin,Srf);
		this.Dir=Dir;
	}
	public Bordr_LMNt(Line Lin,Double Srf){this.Srf=new Slider(Lin,Srf);}
	public Bordr_LMNt(){}

	public Slider Srf;
		public double Srf(){return Srf.Loc;}
	public boolean Dir;
		public boolean Dir(){return Dir;}

	public boolean Chek_Cond(Object Border)
	{
		/*for(Condition_Object Condition:((Border_Component)Border).Condition)
		{
			if(((Border_Condition)Condition).Surface.On==this.Surface.On&&((Border_Condition)Condition).Direction!=this.Direction)
			{
				if(!this.Direction)
				{
					if(this.Surface.Location<((Border_Condition)Condition).Surface.Location){return false;}

					return true;
				}
				if(!this.Direction){return true;}
				if(this.Surface.Location>((Border_Condition)Condition).Surface.Location){return false;}
			}
		}*/

		return false;
	}
	public static double Get_FRthst_Point(boolean Direction)
	{
		return 0;
	}
	public double Get_Lost_Point(Condition Bordr,Line Lin)
	{
		return 0;
	}
	public double Get_LNg(Line Lin)
	{
		//return Math_Plus.Difference(Lin.);
		return 0;
	}

	static{Init_Nd(Bordr_LMNt.class);}
}