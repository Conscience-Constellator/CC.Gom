package CC.Encycloped.Abs.Scal.Gom.Scrut.Bord_;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.CCPL.Fun.Object.Chek.Al;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.CCPL.Fun.Object.Chek.Condition;
import CC.Encycloped.Abs.Scal.Gom.Box;
import CC.Encycloped.Abs.Scal.Gom.Cust_SpAc;
import CC.Math.Line;
import CC.Math.Math_Plus;
import CC.Util.By.Get_Q_By_Q;
import CC.Util.Component;
import CC.List.Ara_Util;
import CC.Util.Conect.Nod.Tre_Nod;
import org.jetbrains.annotations.NotNull;
import java.util.HashMap;

/**
Wrapper for condition:
	adds;
		tree structure.
		, & more efficient pre-checks to full-border-definition.
 */
public class Bordr_Comp extends Component implements Tre_Nod,Condition, Bordr_Prt
{
	public static final Clas_Rap Class=Init_StRt(Bordr_Comp.class
		,Clas_Rap.class
	);/*Dep !done*/

	public Bordr_Comp(Condition Cond){this.Cond=Cond;}
	public Bordr_Comp(Bordr_LMNt... Condit_List){Cond=new Al(Condit_List);}
	public Bordr_Comp(double Hit,double Lng,double Wid)
	{
		Double A_Rad=Hit/2D;
		Double B_Rad=Lng/2D;
		Double C_Rad=Wid/2D;
		Line A= Cust_SpAc.Dimg[0];
		Line B= Cust_SpAc.Dimg[1];
		Line C= Cust_SpAc.Dimg[2];
		Cond=new Al(new Bordr_LMNt[]{new Bordr_LMNt(A,A_Rad),new Bordr_LMNt(A,A_Rad,true),new Bordr_LMNt(B,B_Rad),new Bordr_LMNt(B,B_Rad,true),new Bordr_LMNt(C,C_Rad),new Bordr_LMNt(C,C_Rad,true)});
	}
	public Bordr_Comp(Line[] Ling,double[] Loc_List,Boolean[] Direction_List)
	{
		Condition[] Condit_List=new Condition[Ling.length];
		for(int Indx=0;Indx<Condit_List.length;Indx+=1)
		{
			Condit_List[Indx]=new Bordr_LMNt(Ling[Indx],Loc_List[Indx],Direction_List[Indx]);
		}
		Cond=new Al(Condit_List);
	}
	public Bordr_Comp(){}

	public Bordr_Comp Stem;
		@Override public void Set_StM(Tre_Nod Stem){this.Stem=(Bordr_Comp)Stem;}
		@Override public Bordr_Comp Get_StM(){return Stem;}

	public Condition Cond;
		public boolean Chek_Cond(Object Context){return this.Taxicab()&&this.Radius()?this.Cond.Chek_Cond(Context):false;}
		public double Radius;
			public boolean Radius(){return true;}
		public double Taxicab;
			public boolean Taxicab(){return true;}

	public static final Al Cube=new Al(new Condition[6]);
		static
		{
			Double Surf=.5D;
			Double Surf_Negativ=-.5D;
			Line[] Dim_List= Cust_SpAc.Dimg;
			Line A=Dim_List[1];
			Line B=Dim_List[2];
			Line C=Dim_List[3];
			Cube.Cond_List[0]=(new Bordr_LMNt(A,Surf_Negativ));
			Cube.Cond_List[1]=(new Bordr_LMNt(A,Surf));
			Cube.Cond_List[2]=(new Bordr_LMNt(B,Surf_Negativ));
			Cube.Cond_List[3]=(new Bordr_LMNt(B,Surf));
			Cube.Cond_List[4]=(new Bordr_LMNt(C,Surf_Negativ));
			Cube.Cond_List[5]=(new Bordr_LMNt(C,Surf));
		}

	public boolean Bord_Condit_Chek(@NotNull Bordr_LMNt Bord_Condit)
	{
		double Vec_Pos=0D;
		HashMap<?,?> Cord=null;
		Math_Plus.Lin_Proj((HashMap<Line,Double>)Cord,Bord_Condit.Srf.On);
		if(Vec_Pos>=Bord_Condit.Srf.Loc){return false;}
		else if(Vec_Pos>=Bord_Condit.Srf.Loc){return true;}

		return false;
	}
	public void Get_List(Bordr_Comp Overlap,Get_Q_By_Q[] Vectrg,Box[] Boxg){if(Chek_Cond(Overlap));}

	public Bordr_Comp[] Branch_List;
		@Override public void Ad_Branch(Tre_Nod Branch){Branch_List=Ara_Util.Rem(Branch_List,(Bordr_Comp)Branch);}
		@Override public void Rem_Branch(Tre_Nod Branch){Branch_List=Ara_Util.Rem(Branch_List,(Bordr_Comp)Branch);}

	public void Bord_2_D(){}
	public void Bord_Polygon(){}
	public void Bord_Sqaroid(){}
	public void Bord_Sqar(){}
	public void Bord_Circloid(){}
	public void Bord_Circl(){}
	public void Bord_3_D(){}
	public void Bord_Polyhedron(){}
	public void Ad_Cub(double Size){}
	public void Bord_Cuboid(){}
	public void Bord_Spher(){}
	public void Bord_Spheroid(){}

	static{Init_Nd(Bordr_Comp.class);}
}