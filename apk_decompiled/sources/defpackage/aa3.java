package defpackage;

import java.io.IOException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aa3 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ aa3(zr8 zr8Var, int i, xr6 xr6Var) {
        this.E = 2;
        this.G = zr8Var;
        this.F = i;
        this.H = xr6Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj = this.H;
        int i2 = this.F;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                zy7 zy7Var = (zy7) obj2;
                zy7 zy7Var2 = (zy7) obj;
                if (i2 == 1) {
                    zy7Var.a();
                } else {
                    zy7Var2.a();
                }
                return ieiVar;
            case 1:
                String str = (String) obj2;
                eq6 eq6Var = (eq6) obj;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    serialDescriptorArr[i3] = j8.o(str + '.' + eq6Var.e[i3], vsg.o, new SerialDescriptor[0]);
                }
                return serialDescriptorArr;
            default:
                zr8 zr8Var = (zr8) obj2;
                try {
                    zr8Var.b0.n(i2, (xr6) obj);
                    break;
                } catch (IOException e) {
                    xr6 xr6Var = xr6.PROTOCOL_ERROR;
                    zr8Var.c(xr6Var, xr6Var, e);
                }
                return ieiVar;
        }
    }

    public /* synthetic */ aa3(int i, Object obj, Object obj2, int i2) {
        this.E = i2;
        this.F = i;
        this.G = obj;
        this.H = obj2;
    }
}
