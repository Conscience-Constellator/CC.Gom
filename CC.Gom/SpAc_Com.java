package CC.Encycloped.Abs.Scal.Gom;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.Math.Line;
import CC.Encycloped.Abs.Scal.Physc.Phys_Com;
import CC.Encycloped.Abs.Scal.Physc.Phys_Comp_Havr;
import CC.Util.By.Get_Q_By_Q;
import CC.Util.Conect.Nod.Tre_Nod;
import java.util.HashMap;

public class SpAc_Com<Vectr_Typ extends Get_Q_By_Q,Bordr_Typ extends Inbl<Vectr_Typ>> implements Phys_Comp_Havr<Vectr_Typ>,Inbl_Havr<Vectr_Typ,Bordr_Typ>,Tre_Nod
{
	public static final Clas_Rap Class=Init_StRt(SpAc_Com.class
		,Clas_Rap.class
	);/*Dep !done*/

	public SpAc_Com(Vectr_Typ Loc){this.Loc=Loc;}
	public SpAc_Com(Vectr_Typ Loc,SpAc_Com StM,SpAc_Com[] Branchg)
	{
		this.Branchg=Branchg;
//		if(Branch_List!=null){for(Spac_Com Branch:Branch_List){Connect(Branch);}}

		this.Loc=Loc;

//		if(Stem!=null){Connect(StM);}
	}
	public SpAc_Com(Vectr_Typ Loc,SpAc_Com StM,Ad_Spac_Com Set_StM,SpAc_Com[] Branchg)
	{
		this(Loc,StM,Branchg);
		this.Connect=Connect;
	}
	public SpAc_Com(Vectr_Typ Loc,Phys_Com[] Compg,SpAc_Com StM,SpAc_Com[] Branchg)
	{
		this(Loc,StM,Branchg);

		for(Object Component: Compg){Ad_Phys_Comp((Phys_Com)Component);}
	}
	public SpAc_Com(Vectr_Typ Loc,Phys_Com[] Compg,SpAc_Com StM,Ad_Spac_Com Con_StM,SpAc_Com[] Branchg)
	{
		this(Loc,Compg,StM,Branchg);
		this.Connect=Connect;
	}
	public SpAc_Com(Vectr_Typ Loc,Object[] Parg,Phys_Com[] Compg,SpAc_Com StM,SpAc_Com[] Branchg)
	{
		this(Loc,Compg,StM,Branchg);

		//for(Object Parameter:Parameter_List){Space_Parameter_List.put();}
	}
	public SpAc_Com(Vectr_Typ Loc,Object[] Parg,Phys_Com[] Compg,SpAc_Com StM,Ad_Spac_Com Connect,SpAc_Com[] Branchg)
	{
		this(Loc,Parg,Compg,StM,Branchg);

		this.Connect=Connect;
	}
	public SpAc_Com(){}

	private SpAc_Com StM;
		@Override public void Set_StM(Tre_Nod StM){}
		@Override public Tre_Nod Get_StM(){return StM;}

		public Ad_Spac_Com Connect;

	public Vectr_Typ Loc;
		public HashMap<String,Object> Spac_Parg=new HashMap<>();
		public void Cord(){
			Spac_Parg.put("C",new HashMap());}
			public double Cord(Line Dim)
			{
				HashMap<Line,Double> Cord_List=(HashMap<Line,Double>)Spac_Parg.get("Coordinate");
				return (Spac_Parg.containsKey(Dim))?Cord_List.get(Dim):0d;
			}
			public HashMap<Line,Double> Cordg(){return (HashMap<Line,Double>)Spac_Parg.get("Coordinate");}
			public void Mov_To(Line Dim,Double Cord){}
			public void Mov_To(HashMap<Line,Double> Update)
			{
				//for(Iterator var1=this.Branch_List.iterator(); var1.hasNext();var2=var1.next()){}
			}

	public HashMap<Clas_Rap,Phys_Com> Compg=new HashMap<>();
		public void Ad_Phys_Comp(Phys_Com Component)
		{
			Component.Set_Onr(this);
			Compg.put(Component.Class,Component);
		}
		public Phys_Com Phys_Comp(Clas_Rap Component){return (Phys_Com)this.Compg.get(Component);}
		public void Rem_Phys_Comp(Clas_Rap Ke)
		{
			if(this.Compg.containsKey(Ke))
			{
				this.Compg.get(Ke).Onr=null;
				this.Compg.remove(Ke);
			}
		}

	public Bordr_Typ P;
		@Override public Bordr_Typ In_Rapd(){return P;}
		@Override public void Set_In_Rapd(Bordr_Typ Bordr){this.P=Bordr;}

	private SpAc_Com[] Branchg;
		@Override public void Ad_Branch(Tre_Nod Branch){}
		@Override public void Rem_Branch(Tre_Nod Branch){}

	static{Init_Nd(SpAc_Com.class);}
}