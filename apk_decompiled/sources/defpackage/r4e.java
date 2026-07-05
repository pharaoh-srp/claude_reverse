package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import okio.Path;

/* JADX INFO: loaded from: classes.dex */
public final class r4e implements yw8 {
    public static final /* synthetic */ int e = 0;
    public final n4e a;
    public final nyj b;
    public final na4 c;
    public volatile /* synthetic */ int d;

    static {
        AtomicIntegerFieldUpdater.newUpdater(r4e.class, "d");
    }

    public r4e(n4e n4eVar) {
        this.a = n4eVar;
        fd9.c(nai.Z(iuj.g(), new al3(zp3.G, 2)));
        y50 y50Var = new y50();
        y50Var.b = new WeakReference(this);
        y50Var.c = new x50(y50Var, this);
        y50Var.d = new o20(1, y50Var);
        nyj nyjVar = new nyj(this);
        this.b = nyjVar;
        el5 el5Var = new el5(n4eVar.g);
        ArrayList arrayList = (ArrayList) el5Var.E;
        ArrayList arrayList2 = (ArrayList) el5Var.H;
        ArrayList arrayList3 = (ArrayList) el5Var.G;
        ArrayList arrayList4 = (ArrayList) el5Var.I;
        hx8 hx8Var = n4eVar.b;
        Object obj = hx8Var.n.a.get(ax8.a);
        int i = 9;
        int i2 = 8;
        if (((Boolean) (obj == null ? Boolean.TRUE : obj)).booleanValue()) {
            arrayList2.add(new zcd(i2));
            arrayList4.add(new zcd(i));
        }
        int i3 = 0;
        c70 c70Var = new c70(i3);
        kce kceVar = jce.a;
        el5Var.k(c70Var, kceVar.b(Uri.class));
        el5Var.k(new c70(3), kceVar.b(Integer.class));
        arrayList3.add(new cpc(new k50(i3), kceVar.b(dli.class)));
        el5Var.l(new zw0(i3), kceVar.b(dli.class));
        el5Var.l(new zw0(4), kceVar.b(dli.class));
        el5Var.l(new zw0(i), kceVar.b(dli.class));
        el5Var.l(new zw0(6), kceVar.b(Drawable.class));
        efe efeVar = bx8.a;
        Object obj2 = hx8Var.n.a.get(bx8.a);
        int iIntValue = ((Number) (obj2 == null ? 4 : obj2)).intValue();
        int i4 = kkf.a;
        jkf jkfVar = new jkf(iIntValue);
        int i5 = Build.VERSION.SDK_INT;
        Object obj3 = y67.a;
        if (i5 >= 29) {
            Object obj4 = hx8Var.n.a.get(bx8.c);
            if (((Boolean) (obj4 == null ? Boolean.TRUE : obj4)).booleanValue()) {
                Object obj5 = hx8Var.n.a.get(bx8.b);
                if (((y67) (obj5 == null ? obj3 : obj5)).equals(obj3)) {
                    arrayList4.add(new ma4(new qmg(jkfVar), i3));
                }
            }
        }
        Object obj6 = hx8Var.n.a.get(bx8.b);
        arrayList4.add(new ma4(new uq1(jkfVar, (y67) (obj6 != null ? obj6 : obj3)), i3));
        el5Var.k(new c70(1), kceVar.b(File.class));
        el5Var.l(new zw0(8), kceVar.b(dli.class));
        el5Var.l(new zw0(3), kceVar.b(ByteBuffer.class));
        el5Var.k(new c70(4), kceVar.b(String.class));
        el5Var.k(new c70(2), kceVar.b(Path.class));
        arrayList3.add(new cpc(new hk7(), kceVar.b(dli.class)));
        arrayList3.add(new cpc(new k50(1), kceVar.b(dli.class)));
        el5Var.l(new zw0(7), kceVar.b(dli.class));
        el5Var.l(new zw0(2), kceVar.b(byte[].class));
        el5Var.l(new zw0(5), kceVar.b(dli.class));
        el5Var.l(new zw0(1), kceVar.b(Bitmap.class));
        arrayList.add(new no6(this, y50Var, nyjVar));
        this.c = new na4(mwa.U(arrayList), mwa.U((ArrayList) el5Var.F), mwa.U(arrayList3), mwa.U(arrayList2), mwa.U(arrayList4));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|(2:4|(1:6)(1:8))(0)|7|9|(5:(1:(1:(7:14|155|15|106|(3:108|(1:110)(2:111|(1:113)(1:114))|115)(2:116|(1:118)(2:121|122))|119|120)(2:19|20))(12:21|151|22|23|24|156|100|101|149|102|(5:105|106|(0)(0)|119|120)|104))(4:28|153|29|76)|27|158|129|(5:131|(1:135)|137|138|139)(2:142|143))(15:33|(1:35)(1:36)|37|(2:(4:40|(3:44|(1:160)(1:47)|41)|159|43)(0)|48)(0)|(1:50)(1:51)|52|(1:54)|55|(1:57)|58|(3:60|(1:65)(1:64)|66)|67|148|68|(2:70|(3:72|(2:75|76)|104)(1:79))(2:127|128))|146|80|(1:89)(1:86)|90|(2:(1:93)(1:94)|95)|96|(8:99|24|156|100|101|149|102|(0))|104|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0159, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x015a, code lost:
    
        r4 = r5;
        r5 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c2 A[Catch: all -> 0x003d, TryCatch #5 {all -> 0x003d, blocks: (B:15:0x0038, B:106:0x01bc, B:108:0x01c2, B:115:0x01eb, B:111:0x01d2, B:114:0x01e5, B:116:0x01f2, B:118:0x01f6, B:121:0x0204, B:122:0x0209), top: B:155:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f2 A[Catch: all -> 0x003d, TryCatch #5 {all -> 0x003d, blocks: (B:15:0x0038, B:106:0x01bc, B:108:0x01c2, B:115:0x01eb, B:111:0x01d2, B:114:0x01e5, B:116:0x01f2, B:118:0x01f6, B:121:0x0204, B:122:0x0209), top: B:155:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x021c A[Catch: all -> 0x023f, TryCatch #7 {all -> 0x023f, blocks: (B:129:0x0218, B:131:0x021c, B:133:0x0222, B:135:0x0228, B:137:0x0231, B:136:0x022d, B:142:0x0241, B:143:0x0247), top: B:158:0x0218 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0241 A[Catch: all -> 0x023f, TRY_ENTER, TryCatch #7 {all -> 0x023f, blocks: (B:129:0x0218, B:131:0x021c, B:133:0x0222, B:135:0x0228, B:137:0x0231, B:136:0x022d, B:142:0x0241, B:143:0x0247), top: B:158:0x0218 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.jx8 r17, int r18, defpackage.vp4 r19) {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r4e.a(jx8, int, vp4):java.lang.Object");
    }

    public final Object b(jx8 jx8Var, vp4 vp4Var) {
        jx8Var.getClass();
        return ((jx8Var.t() instanceof i5e) || nx8.g(jx8Var) != null) ? fd9.N(new ba9(this, jx8Var, null, 12), vp4Var) : a(jx8Var, 1, vp4Var);
    }

    public final w4e c() {
        return (w4e) this.a.d.getValue();
    }

    public final void d(eu6 eu6Var, y4h y4hVar, tqh tqhVar) {
        jx8 jx8VarA = eu6Var.a();
        if (y4hVar instanceof b11) {
            z5i z5iVarA = nx8.h(eu6Var.a()).a((b11) y4hVar, eu6Var);
            if (!(z5iVarA instanceof n6c)) {
                tqhVar.getClass();
                z5iVarA.a();
            }
        }
        tqhVar.getClass();
        jx8VarA.getClass();
    }
}
