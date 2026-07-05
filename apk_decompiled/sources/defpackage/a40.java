package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a40 implements sz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ a40(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.E;
        Object obj5 = this.F;
        switch (i) {
            case 0:
                b40 b40Var = (b40) obj5;
                ubi ubiVarB = ((zt7) b40Var.I).b((xt7) obj, (dv7) obj2, ((wu7) obj3).a, ((xu7) obj4).a);
                if (ubiVarB instanceof tbi) {
                    Object obj6 = ((tbi) ubiVarB).E;
                    obj6.getClass();
                    return (Typeface) obj6;
                }
                lrb lrbVar = new lrb(ubiVarB, b40Var.N);
                b40Var.N = lrbVar;
                return lrbVar.M();
            case 1:
                SQLiteCursorDriver sQLiteCursorDriver = (SQLiteCursorDriver) obj2;
                String str = (String) obj3;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                sy7 sy7Var = new sy7(sQLiteQuery);
                gzg gzgVar = (gzg) ((efe) obj5).F;
                int length = gzgVar.H.length;
                for (int i2 = 1; i2 < length; i2++) {
                    int i3 = gzgVar.H[i2];
                    if (i3 == 1) {
                        sy7Var.o(i2, gzgVar.I[i2]);
                    } else if (i3 == 2) {
                        sy7Var.k0(gzgVar.J[i2], i2);
                    } else if (i3 == 3) {
                        String str2 = gzgVar.K[i2];
                        str2.getClass();
                        sy7Var.u(i2, str2);
                    } else if (i3 == 4) {
                        byte[] bArr = gzgVar.L[i2];
                        bArr.getClass();
                        sy7Var.p(bArr, i2);
                    } else if (i3 == 5) {
                        sy7Var.q(i2);
                    }
                }
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            case 2:
                rz7 rz7Var = (rz7) obj5;
                px9 px9Var = (px9) obj;
                ((Integer) obj2).intValue();
                ld4 ld4Var = (ld4) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(px9Var) ? 4 : 2;
                }
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 131) != 130)) {
                    rz7Var.invoke(px9Var, e18Var, Integer.valueOf(iIntValue & 14));
                } else {
                    e18Var.T();
                }
                return iei.a;
            default:
                rjg rjgVar = (rjg) obj5;
                ((Boolean) obj4).getClass();
                ((ie3) obj).getClass();
                ((ie3) obj2).getClass();
                ((d56) obj3).getClass();
                return rjgVar;
        }
    }
}
