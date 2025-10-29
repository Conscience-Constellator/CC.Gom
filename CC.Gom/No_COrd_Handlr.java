package CC.Encycloped.Abs.Scal.Gom;

public interface No_COrd_Handlr
{
	int Get_Int()throws No_COrd_Xeptn;
	long Get_Long()throws No_COrd_Xeptn;
	float Get_Flot()throws No_COrd_Xeptn;
	double Get_Dubl()throws No_COrd_Xeptn;
	void Set(int Cord)throws No_COrd_Xeptn;
	void Set(long Cord)throws No_COrd_Xeptn;
	void Set(float Cord)throws No_COrd_Xeptn;
	void Set(double Cord)throws No_COrd_Xeptn;
}