package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p39 {
    public static final z74 a = new z74(new aua(true));

    public static final void a(xb0 xb0Var, jz0 jz0Var, egg eggVar, Character ch) {
        d8a d8aVarE = x44.E();
        for (jz0 jz0Var2 = jz0Var.b.b; jz0Var2 != null; jz0Var2 = jz0Var2.b.e) {
            xb0 xb0Var2 = new xb0();
            b(xb0Var2, jz0Var2, eggVar);
            zb0 zb0VarN = xb0Var2.n();
            if (zb0VarN.F.length() > 0) {
                d8aVarE.add(zb0VarN);
            }
        }
        int i = 0;
        ListIterator listIterator = x44.v(d8aVarE).listIterator(0);
        while (true) {
            c8a c8aVar = (c8a) listIterator;
            if (!c8aVar.hasNext()) {
                return;
            }
            Object next = c8aVar.next();
            int i2 = i + 1;
            if (i < 0) {
                x44.n0();
                throw null;
            }
            zb0 zb0Var = (zb0) next;
            if (i > 0 && ch != null) {
                xb0Var.c(ch.charValue());
            }
            xb0Var.e(zb0Var);
            i = i2;
        }
    }

    public static final void b(xb0 xb0Var, jz0 jz0Var, egg eggVar) {
        int iM;
        nz0 nz0Var = jz0Var.a;
        if (nz0Var instanceof zz0) {
            xb0Var.h(((zz0) nz0Var).a);
            return;
        }
        boolean z = nz0Var instanceof sy0;
        z28 z28Var = xt7.H;
        if (z) {
            iM = xb0Var.m(new egg(0L, 0L, null, null, null, z28Var, null, 0L, null, null, null, 0L, null, null, 65503));
            try {
                xb0Var.h(((sy0) nz0Var).a);
                return;
            } finally {
            }
        }
        if (nz0Var instanceof wy0) {
            iM = xb0Var.m(new egg(0L, 0L, null, new wu7(1), null, null, null, 0L, null, null, null, 0L, null, null, 65527));
            try {
                a(xb0Var, jz0Var, eggVar, null);
                return;
            } finally {
            }
        }
        if (nz0Var instanceof sz0) {
            iM = xb0Var.m(new egg(0L, 0L, dv7.M, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
            try {
                a(xb0Var, jz0Var, eggVar, null);
                return;
            } finally {
            }
        }
        if (nz0Var instanceof rz0) {
            iM = xb0Var.m(new egg(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, qeh.d, null, 61439));
            try {
                a(xb0Var, jz0Var, eggVar, null);
                return;
            } finally {
            }
        }
        if (nz0Var instanceof gz0) {
            int iK = xb0Var.k(new n6a(((gz0) nz0Var).a, (ekh) null, 6));
            try {
                iM = xb0Var.m(eggVar);
                try {
                    a(xb0Var, jz0Var, eggVar, null);
                    return;
                } finally {
                }
            } finally {
                xb0Var.j(iK);
            }
        }
        if (nz0Var instanceof cz0) {
            a(xb0Var, jz0Var, eggVar, null);
            return;
        }
        if (nz0Var instanceof bz0) {
            xb0Var.h(((bz0) nz0Var).a);
            return;
        }
        if (nz0Var instanceof ez0) {
            xb0Var.h(((ez0) nz0Var).a);
            return;
        }
        if (nz0Var.equals(qz0.a)) {
            xb0Var.c(' ');
            return;
        }
        if (nz0Var.equals(yy0.a)) {
            xb0Var.c('\n');
            return;
        }
        if (nz0Var.equals(vy0.a)) {
            a(xb0Var, jz0Var, eggVar, ' ');
            return;
        }
        if (nz0Var.equals(pz0.a) || (nz0Var instanceof zy0) || (nz0Var instanceof uz0)) {
            a(xb0Var, jz0Var, eggVar, null);
            return;
        }
        if (nz0Var.equals(ry0.a) || nz0Var.equals(iz0.a) || (nz0Var instanceof oz0) || (nz0Var instanceof b01)) {
            a(xb0Var, jz0Var, eggVar, ' ');
            return;
        }
        if (nz0Var.equals(xz0.a) || nz0Var.equals(tz0.a) || nz0Var.equals(wz0.a) || nz0Var.equals(yz0.a)) {
            a(xb0Var, jz0Var, eggVar, ' ');
            return;
        }
        if (nz0Var instanceof xy0) {
            iM = xb0Var.m(new egg(0L, 0L, null, null, null, z28Var, null, 0L, null, null, null, 0L, null, null, 65503));
            try {
                xb0Var.h(bsg.n1(((xy0) nz0Var).e, '\n'));
                return;
            } finally {
            }
        }
        if (nz0Var instanceof dz0) {
            iM = xb0Var.m(new egg(0L, 0L, null, null, null, z28Var, null, 0L, null, null, null, 0L, null, null, 65503));
            try {
                xb0Var.h(bsg.n1(((dz0) nz0Var).a, '\n'));
            } finally {
            }
        } else {
            if (nz0Var instanceof az0) {
                xb0Var.h(bsg.n1(((az0) nz0Var).a, '\n'));
                return;
            }
            if (nz0Var instanceof uy0) {
                xb0Var.h(((uy0) nz0Var).a);
            } else {
                if ((nz0Var instanceof hz0) || nz0Var.equals(a01.a)) {
                    return;
                }
                wg6.i();
            }
        }
    }

    public static zb0 c(String str) {
        egg eggVar = new egg(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, qeh.c, null, 61439);
        str.getClass();
        if (str.length() == 0) {
            return new zb0("");
        }
        jz0 jz0VarA = a.a(str);
        xb0 xb0Var = new xb0();
        b(xb0Var, jz0VarA, eggVar);
        return xb0Var.n();
    }
}
