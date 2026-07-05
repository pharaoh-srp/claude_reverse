package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class beb implements quc, ta8 {
    public final Path a = new Path();
    public final Path b = new Path();
    public final Path c = new Path();
    public final ArrayList d = new ArrayList();
    public final aeb e;

    public beb(aeb aebVar) {
        this.e = aebVar;
    }

    public final void a(Path.Op op) {
        Path path = this.b;
        path.reset();
        Path path2 = this.a;
        path2.reset();
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            quc qucVar = (quc) arrayList.get(size);
            if (qucVar instanceof sn4) {
                sn4 sn4Var = (sn4) qucVar;
                ArrayList arrayList2 = (ArrayList) sn4Var.d();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path pathE = ((quc) arrayList2.get(size2)).e();
                    Matrix matrixD = sn4Var.d;
                    c5i c5iVar = sn4Var.k;
                    if (c5iVar != null) {
                        matrixD = c5iVar.d();
                    } else {
                        matrixD.reset();
                    }
                    pathE.transform(matrixD);
                    path.addPath(pathE);
                }
            } else {
                path.addPath(qucVar.e());
            }
        }
        int i = 0;
        quc qucVar2 = (quc) arrayList.get(0);
        if (qucVar2 instanceof sn4) {
            sn4 sn4Var2 = (sn4) qucVar2;
            List listD = sn4Var2.d();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listD;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path pathE2 = ((quc) arrayList3.get(i)).e();
                Matrix matrixD2 = sn4Var2.d;
                c5i c5iVar2 = sn4Var2.k;
                if (c5iVar2 != null) {
                    matrixD2 = c5iVar2.d();
                } else {
                    matrixD2.reset();
                }
                pathE2.transform(matrixD2);
                path2.addPath(pathE2);
                i++;
            }
        } else {
            path2.set(qucVar2.e());
        }
        this.c.op(path2, path, op);
    }

    @Override // defpackage.ym4
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            ((quc) arrayList.get(i)).b(list, list2);
            i++;
        }
    }

    @Override // defpackage.ta8
    public final void d(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            ym4 ym4Var = (ym4) listIterator.previous();
            if (ym4Var instanceof quc) {
                this.d.add((quc) ym4Var);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.quc
    public final Path e() {
        Path path = this.c;
        path.reset();
        aeb aebVar = this.e;
        if (!aebVar.b) {
            int iF = sq6.F(aebVar.a);
            if (iF == 0) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.d;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((quc) arrayList.get(i)).e());
                    i++;
                }
            } else {
                if (iF == 1) {
                    a(Path.Op.UNION);
                    return path;
                }
                if (iF == 2) {
                    a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (iF == 3) {
                    a(Path.Op.INTERSECT);
                    return path;
                }
                if (iF == 4) {
                    a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
