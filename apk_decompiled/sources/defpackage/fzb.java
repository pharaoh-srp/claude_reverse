package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fzb implements o5b {
    public final /* synthetic */ of6 a;
    public final /* synthetic */ nwb b;
    public final /* synthetic */ hsc c;

    public fzb(of6 of6Var, nwb nwbVar, hsc hscVar) {
        this.a = of6Var;
        this.b = nwbVar;
        this.c = hscVar;
    }

    @Override // defpackage.o5b
    public final p5b b(q5b q5bVar, List list, long j) {
        Integer numValueOf;
        long jA = rl4.a(0, 0, 0, 0, 10, j);
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((h5b) list.get(i)).u(jA));
        }
        Integer num = null;
        int i2 = 1;
        if (arrayList.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((c3d) arrayList.get(0)).E);
            int size2 = arrayList.size() - 1;
            if (1 <= size2) {
                int i3 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((c3d) arrayList.get(i3)).E);
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i3 == size2) {
                        break;
                    }
                    i3++;
                }
            }
        }
        final int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        if (!arrayList.isEmpty()) {
            Integer numValueOf3 = Integer.valueOf(((c3d) arrayList.get(0)).F);
            int size3 = arrayList.size() - 1;
            if (1 <= size3) {
                while (true) {
                    Integer numValueOf4 = Integer.valueOf(((c3d) arrayList.get(i2)).F);
                    if (numValueOf4.compareTo(numValueOf3) > 0) {
                        numValueOf3 = numValueOf4;
                    }
                    if (i2 == size3) {
                        break;
                    }
                    i2++;
                }
            }
            num = numValueOf3;
        }
        int iIntValue2 = num != null ? num.intValue() : 0;
        final of6 of6Var = this.a;
        final nwb nwbVar = this.b;
        final hsc hscVar = this.c;
        return q5bVar.U(iIntValue, iIntValue2, nm6.E, new bz7() { // from class: ezb
            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                b3d b3dVar = (b3d) obj;
                q28 q28Var = of6Var.b;
                vq5 vq5VarC = ((ry) q28Var.F).c();
                og6 og6Var = og6.E;
                float f = vq5VarC.f(og6Var);
                float f2 = -iIntValue;
                int i4 = gzb.a;
                nwb nwbVar2 = nwbVar;
                boolean zBooleanValue = ((Boolean) nwbVar2.getValue()).booleanValue();
                hsc hscVar2 = hscVar;
                if (!zBooleanValue || f != f2) {
                    if (!((Boolean) nwbVar2.getValue()).booleanValue()) {
                        nwbVar2.setValue(Boolean.TRUE);
                    }
                    hscVar2.i(f2);
                    ed6 ed6Var = new ed6();
                    ed6Var.a(og6Var, hscVar2.h());
                    ed6Var.a(og6.F, MTTypesetterKt.kLineSkipLimitMultiplier);
                    float[] fArr = ed6Var.b;
                    ArrayList arrayList2 = ed6Var.a;
                    int size4 = arrayList2.size();
                    fArr.getClass();
                    yfd.t(size4, fArr.length);
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size4);
                    fArrCopyOfRange.getClass();
                    ((ry) q28Var.F).h(new vq5(arrayList2, fArrCopyOfRange), ((wz5) q28Var.G).getValue());
                }
                float fH = hscVar2.h();
                if (wd6.d0((((ry) q28Var.F).f() - fH) / (MTTypesetterKt.kLineSkipLimitMultiplier - fH), MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f) != MTTypesetterKt.kLineSkipLimitMultiplier) {
                    ArrayList arrayList3 = arrayList;
                    int size5 = arrayList3.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        b3d.k(b3dVar, (c3d) arrayList3.get(i5), 0, 0);
                    }
                }
                return iei.a;
            }
        });
    }
}
