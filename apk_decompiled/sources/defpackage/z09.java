package defpackage;

import androidx.health.platform.client.proto.g;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class z09 {
    public final int a;
    public final bz7 b;
    public final bt7[] c;

    public z09(int i, bz7 bz7Var) {
        bt7 bt7Var;
        bz7Var.getClass();
        this.a = i;
        this.b = bz7Var;
        if (1 > i || i >= 17) {
            mr9.q(grc.p(i, "Size must be between 1 and 16, was "));
            throw null;
        }
        bt7[] bt7VarArr = new bt7[i];
        for (int i2 = 0; i2 < i; i2++) {
            switch (i2) {
                case 0:
                    bt7Var = new bt7();
                    break;
                case 1:
                    bt7Var = new bt7();
                    break;
                case 2:
                    bt7Var = new bt7();
                    break;
                case 3:
                    bt7Var = new bt7();
                    break;
                case 4:
                    bt7Var = new bt7();
                    break;
                case 5:
                    bt7Var = new bt7();
                    break;
                case 6:
                    bt7Var = new bt7();
                    break;
                case 7:
                    bt7Var = new bt7();
                    break;
                case 8:
                    bt7Var = new bt7();
                    break;
                case 9:
                    bt7Var = new bt7();
                    break;
                case 10:
                    bt7Var = new bt7();
                    break;
                case 11:
                    bt7Var = new bt7();
                    break;
                case 12:
                    bt7Var = new bt7();
                    break;
                case 13:
                    bt7Var = new bt7();
                    break;
                case 14:
                    bt7Var = new bt7();
                    break;
                case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                    bt7Var = new bt7();
                    break;
                default:
                    sz6.j(grc.u("Index ", i2, " should have been caught by size validation"));
                    throw null;
            }
            bt7VarArr[i2] = bt7Var;
        }
        this.c = bt7VarArr;
    }

    public final bt7 a(int i, int i2, Set set) {
        int i3;
        bt7[] bt7VarArr = this.c;
        if (i == 5 || i == 2 || i == 3 || i == 8) {
            if (i2 <= 0) {
                i2 = bt7VarArr.length;
            }
            i3 = i2 - 1;
        } else {
            if (i != 6 && i != 1 && i != 4 && i != 7) {
                return bt7.b;
            }
            i3 = i2 < bt7VarArr.length - 1 ? i2 + 1 : 0;
        }
        return set.contains(Integer.valueOf(i3)) ? bt7.b : ((Boolean) this.b.invoke(Integer.valueOf(i3))).booleanValue() ? bt7VarArr[i3] : a(i, i3, dxf.q0(set, Integer.valueOf(i3)));
    }
}
