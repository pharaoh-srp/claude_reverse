package defpackage;

import androidx.media3.exoplayer.source.MergingMediaSource$IllegalMergeException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jeb extends ae4 {
    public static final j7b s;
    public final me1[] k;
    public final ArrayList l;
    public final mqh[] m;
    public final ArrayList n;
    public final yl4 o;
    public int p;
    public long[][] q;
    public MergingMediaSource$IllegalMergeException r;

    static {
        xm7 xm7Var = new xm7();
        iz8 iz8Var = nz8.F;
        vde vdeVar = vde.I;
        List list = Collections.EMPTY_LIST;
        vde vdeVar2 = vde.I;
        e7b e7bVar = new e7b();
        s = new j7b("MergingMediaSource", new d7b(xm7Var), null, new f7b(e7bVar), n7b.B, h7b.a);
    }

    public jeb(me1... me1VarArr) {
        yl4 yl4Var = new yl4();
        this.k = me1VarArr;
        this.o = yl4Var;
        this.n = new ArrayList(Arrays.asList(me1VarArr));
        this.p = -1;
        this.l = new ArrayList(me1VarArr.length);
        for (int i = 0; i < me1VarArr.length; i++) {
            this.l.add(new ArrayList());
        }
        this.m = new mqh[me1VarArr.length];
        this.q = new long[0][];
        new HashMap();
        fok.c(8, "expectedKeys");
        fok.c(2, "expectedValuesPerKey");
        d84 d84VarA = d84.a();
        new cub();
        fd9.E(d84VarA.isEmpty());
    }

    @Override // defpackage.me1
    public final s7b a(z7b z7bVar, xv8 xv8Var, long j) {
        me1[] me1VarArr = this.k;
        int length = me1VarArr.length;
        s7b[] s7bVarArr = new s7b[length];
        mqh[] mqhVarArr = this.m;
        int iB = mqhVarArr[0].b(z7bVar.a);
        for (int i = 0; i < length; i++) {
            z7b z7bVarA = z7bVar.a(mqhVarArr[i].l(iB));
            s7bVarArr[i] = me1VarArr[i].a(z7bVarA, xv8Var, j - this.q[iB][i]);
            ((List) this.l.get(i)).add(new ieb(z7bVarA, s7bVarArr[i]));
        }
        return new heb(this.o, this.q[iB], s7bVarArr);
    }

    @Override // defpackage.me1
    public final j7b g() {
        me1[] me1VarArr = this.k;
        return me1VarArr.length > 0 ? me1VarArr[0].g() : s;
    }

    @Override // defpackage.ae4, defpackage.me1
    public final void i() throws MergingMediaSource$IllegalMergeException {
        MergingMediaSource$IllegalMergeException mergingMediaSource$IllegalMergeException = this.r;
        if (mergingMediaSource$IllegalMergeException != null) {
            throw mergingMediaSource$IllegalMergeException;
        }
        super.i();
    }

    @Override // defpackage.me1
    public final void k(yp5 yp5Var) {
        this.j = yp5Var;
        this.i = tpi.k(null);
        int i = 0;
        while (true) {
            me1[] me1VarArr = this.k;
            if (i >= me1VarArr.length) {
                return;
            }
            w(Integer.valueOf(i), me1VarArr[i]);
            i++;
        }
    }

    @Override // defpackage.me1
    public final void m(s7b s7bVar) {
        heb hebVar = (heb) s7bVar;
        int i = 0;
        while (true) {
            me1[] me1VarArr = this.k;
            if (i >= me1VarArr.length) {
                return;
            }
            List list = (List) this.l.get(i);
            boolean[] zArr = hebVar.F;
            s7b[] s7bVarArr = hebVar.E;
            s7b s7bVar2 = zArr[i] ? ((yph) s7bVarArr[i]).E : s7bVarArr[i];
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (((ieb) list.get(i2)).b.equals(s7bVar2)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            }
            me1VarArr[i].m(hebVar.F[i] ? ((yph) s7bVarArr[i]).E : s7bVarArr[i]);
            i++;
        }
    }

    @Override // defpackage.ae4, defpackage.me1
    public final void o() {
        super.o();
        Arrays.fill(this.m, (Object) null);
        this.p = -1;
        this.r = null;
        ArrayList arrayList = this.n;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // defpackage.me1
    public final void r(j7b j7bVar) {
        this.k[0].r(j7bVar);
    }

    @Override // defpackage.ae4
    public final z7b s(Object obj, z7b z7bVar) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(iIntValue);
        for (int i = 0; i < list.size(); i++) {
            if (((ieb) list.get(i)).a.equals(z7bVar)) {
                return ((ieb) ((List) arrayList.get(0)).get(i)).a;
            }
        }
        return null;
    }

    @Override // defpackage.ae4
    public final void v(Object obj, me1 me1Var, mqh mqhVar) {
        Integer num = (Integer) obj;
        if (this.r != null) {
            return;
        }
        if (this.p == -1) {
            this.p = mqhVar.h();
        } else if (mqhVar.h() != this.p) {
            this.r = new MergingMediaSource$IllegalMergeException();
            return;
        }
        int length = this.q.length;
        mqh[] mqhVarArr = this.m;
        if (length == 0) {
            this.q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.p, mqhVarArr.length);
        }
        ArrayList arrayList = this.n;
        arrayList.remove(me1Var);
        mqhVarArr[num.intValue()] = mqhVar;
        if (arrayList.isEmpty()) {
            l(mqhVarArr[0]);
        }
    }
}
