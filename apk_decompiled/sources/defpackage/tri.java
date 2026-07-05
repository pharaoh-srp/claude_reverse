package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tri extends sri {
    public ovc[] a;
    public String b;
    public int c;

    public tri(tri triVar) {
        this.a = null;
        this.c = 0;
        this.b = triVar.b;
        ovc[] ovcVarArr = triVar.a;
        ovc[] ovcVarArr2 = new ovc[ovcVarArr.length];
        for (int i = 0; i < ovcVarArr.length; i++) {
            ovcVarArr2[i] = new ovc(ovcVarArr[i]);
        }
        this.a = ovcVarArr2;
    }

    public ovc[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(ovc[] ovcVarArr) {
        ovc[] ovcVarArr2 = this.a;
        if (ovcVarArr2 != null && ovcVarArr != null && ovcVarArr2.length == ovcVarArr.length) {
            for (int i = 0; i < ovcVarArr2.length; i++) {
                ovc ovcVar = ovcVarArr2[i];
                char c = ovcVar.a;
                ovc ovcVar2 = ovcVarArr[i];
                if (c == ovcVar2.a && ovcVar.b.length == ovcVar2.b.length) {
                }
            }
            ovc[] ovcVarArr3 = this.a;
            for (int i2 = 0; i2 < ovcVarArr.length; i2++) {
                ovcVarArr3[i2].a = ovcVarArr[i2].a;
                int i3 = 0;
                while (true) {
                    float[] fArr = ovcVarArr[i2].b;
                    if (i3 < fArr.length) {
                        ovcVarArr3[i2].b[i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            return;
        }
        ovc[] ovcVarArr4 = new ovc[ovcVarArr.length];
        for (int i4 = 0; i4 < ovcVarArr.length; i4++) {
            ovcVarArr4[i4] = new ovc(ovcVarArr[i4]);
        }
        this.a = ovcVarArr4;
    }

    public tri() {
        this.a = null;
        this.c = 0;
    }
}
