package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class rx7 {
    public final lx7 A;
    public final ql8 B;
    public ad C;
    public ad D;
    public ad E;
    public ArrayDeque F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public tx7 O;
    public final m P;
    public boolean b;
    public ArrayList e;
    public vdc g;
    public final ArrayList n;
    public final nyj o;
    public final CopyOnWriteArrayList p;
    public final jx7 q;
    public final jx7 r;
    public final jx7 s;
    public final jx7 t;
    public final kx7 u;
    public int v;
    public ex7 w;
    public d4c x;
    public cx7 y;
    public cx7 z;
    public final ArrayList a = new ArrayList();
    public final dpf c = new dpf(13);
    public ArrayList d = new ArrayList();
    public final ix7 f = new ix7(this);
    public tb1 h = null;
    public boolean i = false;
    public final db1 j = new db1(1, this);
    public final AtomicInteger k = new AtomicInteger();
    public final Map l = Collections.synchronizedMap(new HashMap());
    public final Map m = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v16, types: [jx7] */
    /* JADX WARN: Type inference failed for: r0v17, types: [jx7] */
    /* JADX WARN: Type inference failed for: r0v18, types: [jx7] */
    /* JADX WARN: Type inference failed for: r0v19, types: [jx7] */
    public rx7() {
        Collections.synchronizedMap(new HashMap());
        this.n = new ArrayList();
        this.o = new nyj(this);
        this.p = new CopyOnWriteArrayList();
        final int i = 0;
        this.q = new hm4(this) { // from class: jx7
            public final /* synthetic */ rx7 b;

            {
                this.b = this;
            }

            @Override // defpackage.hm4
            public final void accept(Object obj) {
                int i2 = i;
                rx7 rx7Var = this.b;
                switch (i2) {
                    case 0:
                        if (rx7Var.L()) {
                            rx7Var.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (rx7Var.L() && num.intValue() == 80) {
                            rx7Var.m(false);
                            break;
                        }
                        break;
                    case 2:
                        aub aubVar = (aub) obj;
                        if (rx7Var.L()) {
                            aubVar.getClass();
                            rx7Var.n(false);
                        }
                        break;
                    default:
                        s2d s2dVar = (s2d) obj;
                        if (rx7Var.L()) {
                            s2dVar.getClass();
                            rx7Var.s(false);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.r = new hm4(this) { // from class: jx7
            public final /* synthetic */ rx7 b;

            {
                this.b = this;
            }

            @Override // defpackage.hm4
            public final void accept(Object obj) {
                int i22 = i2;
                rx7 rx7Var = this.b;
                switch (i22) {
                    case 0:
                        if (rx7Var.L()) {
                            rx7Var.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (rx7Var.L() && num.intValue() == 80) {
                            rx7Var.m(false);
                            break;
                        }
                        break;
                    case 2:
                        aub aubVar = (aub) obj;
                        if (rx7Var.L()) {
                            aubVar.getClass();
                            rx7Var.n(false);
                        }
                        break;
                    default:
                        s2d s2dVar = (s2d) obj;
                        if (rx7Var.L()) {
                            s2dVar.getClass();
                            rx7Var.s(false);
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.s = new hm4(this) { // from class: jx7
            public final /* synthetic */ rx7 b;

            {
                this.b = this;
            }

            @Override // defpackage.hm4
            public final void accept(Object obj) {
                int i22 = i3;
                rx7 rx7Var = this.b;
                switch (i22) {
                    case 0:
                        if (rx7Var.L()) {
                            rx7Var.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (rx7Var.L() && num.intValue() == 80) {
                            rx7Var.m(false);
                            break;
                        }
                        break;
                    case 2:
                        aub aubVar = (aub) obj;
                        if (rx7Var.L()) {
                            aubVar.getClass();
                            rx7Var.n(false);
                        }
                        break;
                    default:
                        s2d s2dVar = (s2d) obj;
                        if (rx7Var.L()) {
                            s2dVar.getClass();
                            rx7Var.s(false);
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.t = new hm4(this) { // from class: jx7
            public final /* synthetic */ rx7 b;

            {
                this.b = this;
            }

            @Override // defpackage.hm4
            public final void accept(Object obj) {
                int i22 = i4;
                rx7 rx7Var = this.b;
                switch (i22) {
                    case 0:
                        if (rx7Var.L()) {
                            rx7Var.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (rx7Var.L() && num.intValue() == 80) {
                            rx7Var.m(false);
                            break;
                        }
                        break;
                    case 2:
                        aub aubVar = (aub) obj;
                        if (rx7Var.L()) {
                            aubVar.getClass();
                            rx7Var.n(false);
                        }
                        break;
                    default:
                        s2d s2dVar = (s2d) obj;
                        if (rx7Var.L()) {
                            s2dVar.getClass();
                            rx7Var.s(false);
                        }
                        break;
                }
            }
        };
        this.u = new kx7(this);
        this.v = -1;
        this.A = new lx7(this);
        this.B = new ql8(19);
        this.F = new ArrayDeque();
        this.P = new m(2, this);
    }

    public static HashSet E(tb1 tb1Var) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < tb1Var.a.size(); i++) {
            cx7 cx7Var = ((zx7) tb1Var.a.get(i)).b;
            if (cx7Var != null && tb1Var.g) {
                hashSet.add(cx7Var);
            }
        }
        return hashSet;
    }

    public static boolean J(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean K(cx7 cx7Var) {
        cx7Var.getClass();
        boolean zK = false;
        for (cx7 cx7Var2 : cx7Var.Z.c.G()) {
            if (cx7Var2 != null) {
                zK = K(cx7Var2);
            }
            if (zK) {
                return true;
            }
        }
        return false;
    }

    public static boolean M(cx7 cx7Var) {
        if (cx7Var == null) {
            return true;
        }
        if (cx7Var.h0) {
            return cx7Var.X == null || M(cx7Var.a0);
        }
        return false;
    }

    public static boolean N(cx7 cx7Var) {
        if (cx7Var == null) {
            return true;
        }
        rx7 rx7Var = cx7Var.X;
        return cx7Var == rx7Var.z && N(rx7Var.y);
    }

    public static void d0(cx7 cx7Var) {
        if (J(2)) {
            Log.v("FragmentManager", "show: " + cx7Var);
        }
        if (cx7Var.e0) {
            cx7Var.e0 = false;
            cx7Var.n0 = !cx7Var.n0;
        }
    }

    public final boolean A(boolean z) {
        boolean zA;
        ArrayList arrayList;
        tb1 tb1Var;
        z(z);
        if (!this.i && (tb1Var = this.h) != null) {
            tb1Var.r = false;
            tb1Var.d();
            if (J(3)) {
                Objects.toString(this.h);
                Objects.toString(this.a);
            }
            this.h.e(false, false);
            this.a.add(0, this.h);
            Iterator it = this.h.a.iterator();
            while (it.hasNext()) {
                cx7 cx7Var = ((zx7) it.next()).b;
                if (cx7Var != null) {
                    cx7Var.Q = false;
                }
            }
            this.h = null;
        }
        boolean z2 = false;
        while (true) {
            ArrayList arrayList2 = this.L;
            ArrayList arrayList3 = this.M;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.a.size();
                        int i = 0;
                        zA = false;
                        while (true) {
                            arrayList = this.a;
                            if (i >= size) {
                                break;
                            }
                            zA |= ((ox7) arrayList.get(i)).a(arrayList2, arrayList3);
                            i++;
                        }
                        arrayList.clear();
                        this.w.O.removeCallbacks(this.P);
                    } finally {
                    }
                }
            }
            if (!zA) {
                g0();
                v();
                ((HashMap) this.c.G).values().removeAll(Collections.singleton(null));
                return z2;
            }
            z2 = true;
            this.b = true;
            try {
                V(this.L, this.M);
            } finally {
                d();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0220 A[PHI: r15
      0x0220: PHI (r15v20 int) = (r15v19 int), (r15v22 int) binds: [B:105:0x020d, B:109:0x0217] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(java.util.ArrayList r27, java.util.ArrayList r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 1314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx7.B(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final cx7 C(int i) {
        dpf dpfVar = this.c;
        ArrayList arrayList = (ArrayList) dpfVar.F;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            cx7 cx7Var = (cx7) arrayList.get(size);
            if (cx7Var != null && cx7Var.b0 == i) {
                return cx7Var;
            }
        }
        for (wx7 wx7Var : ((HashMap) dpfVar.G).values()) {
            if (wx7Var != null) {
                cx7 cx7VarJ = wx7Var.j();
                if (cx7VarJ.b0 == i) {
                    return cx7VarJ;
                }
            }
        }
        return null;
    }

    public final cx7 D(String str) {
        dpf dpfVar = this.c;
        ArrayList arrayList = (ArrayList) dpfVar.F;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            cx7 cx7Var = (cx7) arrayList.get(size);
            if (cx7Var != null && str.equals(cx7Var.d0)) {
                return cx7Var;
            }
        }
        for (wx7 wx7Var : ((HashMap) dpfVar.G).values()) {
            if (wx7Var != null) {
                cx7 cx7VarJ = wx7Var.j();
                if (str.equals(cx7VarJ.d0)) {
                    return cx7VarJ;
                }
            }
        }
        return null;
    }

    public final ViewGroup F(cx7 cx7Var) {
        ViewGroup viewGroup = cx7Var.j0;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (cx7Var.c0 <= 0 || !this.x.c0()) {
            return null;
        }
        View viewB0 = this.x.b0(cx7Var.c0);
        if (viewB0 instanceof ViewGroup) {
            return (ViewGroup) viewB0;
        }
        return null;
    }

    public final lx7 G() {
        cx7 cx7Var = this.y;
        return cx7Var != null ? cx7Var.X.G() : this.A;
    }

    public final ql8 H() {
        cx7 cx7Var = this.y;
        return cx7Var != null ? cx7Var.X.H() : this.B;
    }

    public final void I(cx7 cx7Var) {
        if (J(2)) {
            Log.v("FragmentManager", "hide: " + cx7Var);
        }
        if (cx7Var.e0) {
            return;
        }
        cx7Var.e0 = true;
        cx7Var.n0 = true ^ cx7Var.n0;
        c0(cx7Var);
    }

    public final boolean L() {
        cx7 cx7Var = this.y;
        if (cx7Var == null) {
            return true;
        }
        return cx7Var.p() && this.y.l().L();
    }

    public final boolean O() {
        return this.H || this.I;
    }

    public final void P(int i, boolean z) {
        ex7 ex7Var;
        if (this.w == null && i != -1) {
            sz6.j("No activity");
            return;
        }
        if (z || i != this.v) {
            this.v = i;
            dpf dpfVar = this.c;
            HashMap map = (HashMap) dpfVar.G;
            Iterator it = ((ArrayList) dpfVar.F).iterator();
            while (it.hasNext()) {
                wx7 wx7Var = (wx7) map.get(((cx7) it.next()).I);
                if (wx7Var != null) {
                    wx7Var.k();
                }
            }
            for (wx7 wx7Var2 : map.values()) {
                if (wx7Var2 != null) {
                    wx7Var2.k();
                    cx7 cx7VarJ = wx7Var2.j();
                    if (cx7VarJ.P && !cx7VarJ.r()) {
                        dpfVar.R(wx7Var2);
                    }
                }
            }
            e0();
            if (this.G && (ex7Var = this.w) != null && this.v == 7) {
                ex7Var.Q.invalidateOptionsMenu();
                this.G = false;
            }
        }
    }

    public final void Q() {
        if (this.w == null) {
            return;
        }
        this.H = false;
        this.I = false;
        this.O.g = false;
        for (cx7 cx7Var : this.c.J()) {
            if (cx7Var != null) {
                cx7Var.Z.Q();
            }
        }
    }

    public final boolean R() {
        return S(-1, 0);
    }

    public final boolean S(int i, int i2) {
        A(false);
        z(true);
        cx7 cx7Var = this.z;
        if (cx7Var != null && i < 0 && cx7Var.i().R()) {
            return true;
        }
        boolean zT = T(this.L, this.M, i, i2);
        if (zT) {
            this.b = true;
            try {
                V(this.L, this.M);
            } finally {
                d();
            }
        }
        g0();
        v();
        ((HashMap) this.c.G).values().removeAll(Collections.singleton(null));
        return zT;
    }

    public final boolean T(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        int size = -1;
        if (!this.d.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : this.d.size() - 1;
            } else {
                int size2 = this.d.size() - 1;
                while (size2 >= 0) {
                    tb1 tb1Var = (tb1) this.d.get(size2);
                    if (i >= 0 && i == tb1Var.s) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z) {
                    size = size2;
                    while (size > 0) {
                        tb1 tb1Var2 = (tb1) this.d.get(size - 1);
                        if (i < 0 || i != tb1Var2.s) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.d.size() - 1; size3 >= size; size3--) {
            arrayList.add((tb1) this.d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void U(cx7 cx7Var) {
        if (J(2)) {
            Log.v("FragmentManager", "remove: " + cx7Var + " nesting=" + cx7Var.W);
        }
        boolean zR = cx7Var.r();
        if (cx7Var.f0 && zR) {
            return;
        }
        dpf dpfVar = this.c;
        synchronized (((ArrayList) dpfVar.F)) {
            ((ArrayList) dpfVar.F).remove(cx7Var);
        }
        cx7Var.O = false;
        if (K(cx7Var)) {
            this.G = true;
        }
        cx7Var.P = true;
        c0(cx7Var);
    }

    public final void V(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            sz6.j("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((tb1) arrayList.get(i)).o) {
                if (i2 != i) {
                    B(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((tb1) arrayList.get(i2)).o) {
                        i2++;
                    }
                }
                B(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            B(arrayList, arrayList2, i2, size);
        }
    }

    public final void W(Bundle bundle) {
        nyj nyjVar;
        wx7 wx7Var;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.w.N.getClassLoader());
                this.m.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.w.N.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        dpf dpfVar = this.c;
        HashMap map2 = (HashMap) dpfVar.H;
        HashMap map3 = (HashMap) dpfVar.G;
        map2.clear();
        map2.putAll(map);
        sx7 sx7Var = (sx7) bundle.getParcelable("state");
        if (sx7Var == null) {
            return;
        }
        map3.clear();
        Iterator it = sx7Var.E.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            nyjVar = this.o;
            if (!zHasNext) {
                break;
            }
            Bundle bundleU = dpfVar.U((String) it.next(), null);
            if (bundleU != null) {
                cx7 cx7Var = (cx7) this.O.b.get(((vx7) bundleU.getParcelable("state")).F);
                if (cx7Var != null) {
                    if (J(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + cx7Var);
                    }
                    wx7Var = new wx7(nyjVar, dpfVar, cx7Var, bundleU);
                } else {
                    wx7Var = new wx7(this.o, this.c, this.w.N.getClassLoader(), G(), bundleU);
                }
                cx7 cx7VarJ = wx7Var.j();
                cx7VarJ.F = bundleU;
                cx7VarJ.X = this;
                if (J(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + cx7VarJ.I + "): " + cx7VarJ);
                }
                wx7Var.m(this.w.N.getClassLoader());
                dpfVar.Q(wx7Var);
                wx7Var.p(this.v);
            }
        }
        tx7 tx7Var = this.O;
        tx7Var.getClass();
        for (cx7 cx7Var2 : new ArrayList(tx7Var.b.values())) {
            if (map3.get(cx7Var2.I) == null) {
                if (J(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + cx7Var2 + " that was not found in the set of active Fragments " + sx7Var.E);
                }
                this.O.f(cx7Var2);
                cx7Var2.X = this;
                wx7 wx7Var2 = new wx7(nyjVar, dpfVar, cx7Var2);
                wx7Var2.p(1);
                wx7Var2.k();
                cx7Var2.P = true;
                wx7Var2.k();
            }
        }
        ArrayList<String> arrayList = sx7Var.F;
        ((ArrayList) dpfVar.F).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                cx7 cx7VarC = dpfVar.C(str3);
                if (cx7VarC == null) {
                    sz6.j(ij0.j("No instantiated fragment for (", str3, ")"));
                    return;
                }
                if (J(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + cx7VarC);
                }
                dpfVar.s(cx7VarC);
            }
        }
        if (sx7Var.G != null) {
            this.d = new ArrayList(sx7Var.G.length);
            int i = 0;
            while (true) {
                ub1[] ub1VarArr = sx7Var.G;
                if (i >= ub1VarArr.length) {
                    break;
                }
                tb1 tb1VarA = ub1VarArr[i].a(this);
                if (J(2)) {
                    StringBuilder sbU = vb7.u("restoreAllState: back stack #", i, " (index ");
                    sbU.append(tb1VarA.s);
                    sbU.append("): ");
                    sbU.append(tb1VarA);
                    Log.v("FragmentManager", sbU.toString());
                    PrintWriter printWriter = new PrintWriter(new xfa());
                    tb1VarA.g("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(tb1VarA);
                i++;
            }
        } else {
            this.d = new ArrayList();
        }
        this.k.set(sx7Var.H);
        String str4 = sx7Var.I;
        if (str4 != null) {
            cx7 cx7VarC2 = dpfVar.C(str4);
            this.z = cx7VarC2;
            r(cx7VarC2);
        }
        ArrayList arrayList2 = sx7Var.J;
        if (arrayList2 != null) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                this.l.put((String) arrayList2.get(i2), (vb1) sx7Var.K.get(i2));
            }
        }
        this.F = new ArrayDeque(sx7Var.L);
    }

    public final Bundle X() {
        ub1[] ub1VarArr;
        ArrayList arrayList;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((yt5) it.next()).f();
        }
        x();
        A(true);
        this.H = true;
        this.O.g = true;
        dpf dpfVar = this.c;
        dpfVar.getClass();
        HashMap map = (HashMap) dpfVar.G;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (wx7 wx7Var : map.values()) {
            if (wx7Var != null) {
                cx7 cx7VarJ = wx7Var.j();
                dpfVar.U(cx7VarJ.I, wx7Var.o());
                arrayList2.add(cx7VarJ.I);
                if (J(2)) {
                    Log.v("FragmentManager", "Saved state of " + cx7VarJ + ": " + cx7VarJ.F);
                }
            }
        }
        HashMap map2 = (HashMap) this.c.H;
        if (!map2.isEmpty()) {
            dpf dpfVar2 = this.c;
            synchronized (((ArrayList) dpfVar2.F)) {
                try {
                    ub1VarArr = null;
                    if (((ArrayList) dpfVar2.F).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) dpfVar2.F).size());
                        for (cx7 cx7Var : (ArrayList) dpfVar2.F) {
                            arrayList.add(cx7Var.I);
                            if (J(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + cx7Var.I + "): " + cx7Var);
                            }
                        }
                    }
                } finally {
                }
            }
            int size = this.d.size();
            if (size > 0) {
                ub1VarArr = new ub1[size];
                for (int i = 0; i < size; i++) {
                    ub1VarArr[i] = new ub1((tb1) this.d.get(i));
                    if (J(2)) {
                        StringBuilder sbU = vb7.u("saveAllState: adding back stack #", i, ": ");
                        sbU.append(this.d.get(i));
                        Log.v("FragmentManager", sbU.toString());
                    }
                }
            }
            sx7 sx7Var = new sx7();
            sx7Var.E = arrayList2;
            sx7Var.F = arrayList;
            sx7Var.G = ub1VarArr;
            sx7Var.H = this.k.get();
            cx7 cx7Var2 = this.z;
            if (cx7Var2 != null) {
                sx7Var.I = cx7Var2.I;
            }
            sx7Var.J.addAll(this.l.keySet());
            sx7Var.K.addAll(this.l.values());
            sx7Var.L = new ArrayList(this.F);
            bundle.putParcelable("state", sx7Var);
            for (String str : this.m.keySet()) {
                bundle.putBundle(ij0.i("result_", str), (Bundle) this.m.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(ij0.i("fragment_", str2), (Bundle) map2.get(str2));
            }
        } else if (J(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void Y() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.w.O.removeCallbacks(this.P);
                    this.w.O.post(this.P);
                    g0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void Z(cx7 cx7Var, boolean z) {
        ViewGroup viewGroupF = F(cx7Var);
        if (viewGroupF == null || !(viewGroupF instanceof hx7)) {
            return;
        }
        ((hx7) viewGroupF).setDrawDisappearingViewsLast(!z);
    }

    public final wx7 a(cx7 cx7Var) {
        String str = cx7Var.p0;
        if (str != null) {
            yx7.c(cx7Var, str);
        }
        if (J(2)) {
            Log.v("FragmentManager", "add: " + cx7Var);
        }
        wx7 wx7VarG = g(cx7Var);
        cx7Var.X = this;
        dpf dpfVar = this.c;
        dpfVar.Q(wx7VarG);
        if (!cx7Var.f0) {
            dpfVar.s(cx7Var);
            cx7Var.P = false;
            cx7Var.n0 = false;
            if (K(cx7Var)) {
                this.G = true;
            }
        }
        return wx7VarG;
    }

    public final void a0(cx7 cx7Var, a4a a4aVar) {
        if (cx7Var == this.c.C(cx7Var.I) && (cx7Var.Y == null || cx7Var.X == this)) {
            cx7Var.q0 = a4aVar;
        } else {
            pmf.i("Fragment ", cx7Var, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final void b(ex7 ex7Var, d4c d4cVar, cx7 cx7Var) {
        if (this.w != null) {
            sz6.j("Already attached");
            return;
        }
        this.w = ex7Var;
        this.x = d4cVar;
        this.y = cx7Var;
        CopyOnWriteArrayList copyOnWriteArrayList = this.p;
        if (cx7Var != null) {
            copyOnWriteArrayList.add(new mx7(cx7Var));
        } else if (ex7Var != null) {
            copyOnWriteArrayList.add(ex7Var);
        }
        if (this.y != null) {
            g0();
        }
        if (ex7Var != null) {
            vdc vdcVarC = ex7Var.Q.c();
            this.g = vdcVarC;
            vdcVarC.a(cx7Var != null ? cx7Var : ex7Var, this.j);
        }
        int i = 0;
        if (cx7Var != null) {
            tx7 tx7Var = cx7Var.X.O;
            HashMap map = tx7Var.c;
            tx7 tx7Var2 = (tx7) map.get(cx7Var.I);
            if (tx7Var2 == null) {
                tx7Var2 = new tx7(tx7Var.e);
                map.put(cx7Var.I, tx7Var2);
            }
            this.O = tx7Var2;
        } else if (ex7Var != null) {
            dyi dyiVarF = ex7Var.Q.f();
            i95 i95Var = i95.b;
            i95Var.getClass();
            dpf dpfVar = new dpf(dyiVarF, tx7.h, i95Var);
            pl9 pl9VarB = jce.a.b(tx7.class);
            String strD = pl9VarB.d();
            if (strD == null) {
                sz6.p("Local and anonymous classes can not be ViewModels");
                return;
            }
            this.O = (tx7) dpfVar.L(pl9VarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strD));
        } else {
            this.O = new tx7(false);
        }
        this.O.g = O();
        this.c.I = this.O;
        ex7 ex7Var2 = this.w;
        if (ex7Var2 != null && cx7Var == null) {
            q28 q28VarG = ex7Var2.g();
            q28VarG.B("android:support:fragments", new u94(3, this));
            Bundle bundleI = q28VarG.i("android:support:fragments");
            if (bundleI != null) {
                W(bundleI);
            }
        }
        ex7 ex7Var3 = this.w;
        if (ex7Var3 != null) {
            z94 z94Var = ex7Var3.Q.M;
            String strConcat = "FragmentManager:".concat(cx7Var != null ? ij0.m(new StringBuilder(), cx7Var.I, ":") : "");
            int i2 = 15;
            this.C = z94Var.c(strConcat.concat("StartActivityForResult"), new vc(2), new efe(i2, this));
            this.D = z94Var.c(strConcat.concat("StartIntentSenderForResult"), new vc(5), new gmf(i2, this));
            this.E = z94Var.c(strConcat.concat("RequestPermissions"), new vc(i), new n78(13, this));
        }
        ex7 ex7Var4 = this.w;
        if (ex7Var4 != null) {
            ex7Var4.i(this.q);
        }
        ex7 ex7Var5 = this.w;
        if (ex7Var5 != null) {
            fx7 fx7Var = ex7Var5.Q;
            jx7 jx7Var = this.r;
            jx7Var.getClass();
            fx7Var.O.add(jx7Var);
        }
        ex7 ex7Var6 = this.w;
        if (ex7Var6 != null) {
            fx7 fx7Var2 = ex7Var6.Q;
            jx7 jx7Var2 = this.s;
            jx7Var2.getClass();
            fx7Var2.Q.add(jx7Var2);
        }
        ex7 ex7Var7 = this.w;
        if (ex7Var7 != null) {
            fx7 fx7Var3 = ex7Var7.Q;
            jx7 jx7Var3 = this.t;
            jx7Var3.getClass();
            fx7Var3.R.add(jx7Var3);
        }
        ex7 ex7Var8 = this.w;
        if (ex7Var8 == null || cx7Var != null) {
            return;
        }
        fx7 fx7Var4 = ex7Var8.Q;
        kx7 kx7Var = this.u;
        kx7Var.getClass();
        fj0 fj0Var = fx7Var4.G;
        ((CopyOnWriteArrayList) fj0Var.G).add(kx7Var);
        ((Runnable) fj0Var.F).run();
    }

    public final void b0(cx7 cx7Var) {
        if (cx7Var != null) {
            if (cx7Var != this.c.C(cx7Var.I) || (cx7Var.Y != null && cx7Var.X != this)) {
                pmf.i("Fragment ", cx7Var, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        cx7 cx7Var2 = this.z;
        this.z = cx7Var;
        r(cx7Var2);
        r(this.z);
    }

    public final void c(cx7 cx7Var) {
        if (J(2)) {
            Log.v("FragmentManager", "attach: " + cx7Var);
        }
        if (cx7Var.f0) {
            cx7Var.f0 = false;
            if (cx7Var.O) {
                return;
            }
            this.c.s(cx7Var);
            if (J(2)) {
                Log.v("FragmentManager", "add from attach: " + cx7Var);
            }
            if (K(cx7Var)) {
                this.G = true;
            }
        }
    }

    public final void c0(cx7 cx7Var) {
        ViewGroup viewGroupF = F(cx7Var);
        if (viewGroupF != null) {
            bx7 bx7Var = cx7Var.m0;
            if ((bx7Var == null ? 0 : bx7Var.e) + (bx7Var == null ? 0 : bx7Var.d) + (bx7Var == null ? 0 : bx7Var.c) + (bx7Var == null ? 0 : bx7Var.b) > 0) {
                if (viewGroupF.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupF.setTag(R.id.visible_removing_fragment_view_tag, cx7Var);
                }
                cx7 cx7Var2 = (cx7) viewGroupF.getTag(R.id.visible_removing_fragment_view_tag);
                bx7 bx7Var2 = cx7Var.m0;
                boolean z = bx7Var2 != null ? bx7Var2.a : false;
                if (cx7Var2.m0 == null) {
                    return;
                }
                cx7Var2.e().a = z;
            }
        }
    }

    public final void d() {
        this.b = false;
        this.M.clear();
        this.L.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.c.F().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((wx7) it.next()).j().j0;
            if (viewGroup != null) {
                hashSet.add(yt5.h(viewGroup, H()));
            }
        }
        return hashSet;
    }

    public final void e0() {
        for (wx7 wx7Var : this.c.F()) {
            cx7 cx7VarJ = wx7Var.j();
            if (cx7VarJ.k0) {
                if (this.b) {
                    this.K = true;
                } else {
                    cx7VarJ.k0 = false;
                    wx7Var.k();
                }
            }
        }
    }

    public final HashSet f(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((tb1) arrayList.get(i)).a.iterator();
            while (it.hasNext()) {
                cx7 cx7Var = ((zx7) it.next()).b;
                if (cx7Var != null && (viewGroup = cx7Var.j0) != null) {
                    hashSet.add(yt5.g(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void f0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new xfa());
        ex7 ex7Var = this.w;
        if (ex7Var == null) {
            try {
                w("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            ex7Var.Q.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    public final wx7 g(cx7 cx7Var) {
        String str = cx7Var.I;
        dpf dpfVar = this.c;
        wx7 wx7Var = (wx7) ((HashMap) dpfVar.G).get(str);
        if (wx7Var != null) {
            return wx7Var;
        }
        wx7 wx7Var2 = new wx7(this.o, dpfVar, cx7Var);
        wx7Var2.m(this.w.N.getClassLoader());
        wx7Var2.p(this.v);
        return wx7Var2;
    }

    public final void g0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    this.j.f(true);
                    if (J(3)) {
                        toString();
                    }
                } else {
                    boolean z = this.d.size() + (this.h != null ? 1 : 0) > 0 && N(this.y);
                    if (J(3)) {
                        toString();
                    }
                    this.j.f(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(cx7 cx7Var) {
        if (J(2)) {
            Log.v("FragmentManager", "detach: " + cx7Var);
        }
        if (cx7Var.f0) {
            return;
        }
        cx7Var.f0 = true;
        if (cx7Var.O) {
            if (J(2)) {
                Log.v("FragmentManager", "remove from detach: " + cx7Var);
            }
            dpf dpfVar = this.c;
            synchronized (((ArrayList) dpfVar.F)) {
                ((ArrayList) dpfVar.F).remove(cx7Var);
            }
            cx7Var.O = false;
            if (K(cx7Var)) {
                this.G = true;
            }
            c0(cx7Var);
        }
    }

    public final void i(boolean z) {
        if (z && this.w != null) {
            f0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (cx7 cx7Var : this.c.J()) {
            if (cx7Var != null) {
                cx7Var.i0 = true;
                if (z) {
                    cx7Var.Z.i(true);
                }
            }
        }
    }

    public final boolean j() {
        if (this.v >= 1) {
            for (cx7 cx7Var : this.c.J()) {
                if (cx7Var != null) {
                    if (!cx7Var.e0 ? cx7Var.Z.j() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean k() {
        if (this.v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (cx7 cx7Var : this.c.J()) {
            if (cx7Var != null && M(cx7Var)) {
                if (!cx7Var.e0 ? cx7Var.Z.k() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(cx7Var);
                    z = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                cx7 cx7Var2 = (cx7) this.e.get(i);
                if (arrayList == null || !arrayList.contains(cx7Var2)) {
                    cx7Var2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void l() throws Exception {
        boolean zIsChangingConfigurations = true;
        this.J = true;
        A(true);
        x();
        ex7 ex7Var = this.w;
        dpf dpfVar = this.c;
        if (ex7Var != null) {
            zIsChangingConfigurations = ((tx7) dpfVar.I).f;
        } else {
            fx7 fx7Var = ex7Var.N;
            if (fx7Var != null) {
                zIsChangingConfigurations = true ^ fx7Var.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it = this.l.values().iterator();
            while (it.hasNext()) {
                for (String str : ((vb1) it.next()).E) {
                    tx7 tx7Var = (tx7) dpfVar.I;
                    tx7Var.getClass();
                    J(3);
                    tx7Var.e(str, false);
                }
            }
        }
        u(-1);
        ex7 ex7Var2 = this.w;
        if (ex7Var2 != null) {
            fx7 fx7Var2 = ex7Var2.Q;
            jx7 jx7Var = this.r;
            jx7Var.getClass();
            fx7Var2.O.remove(jx7Var);
        }
        ex7 ex7Var3 = this.w;
        if (ex7Var3 != null) {
            ex7Var3.j(this.q);
        }
        ex7 ex7Var4 = this.w;
        if (ex7Var4 != null) {
            fx7 fx7Var3 = ex7Var4.Q;
            jx7 jx7Var2 = this.s;
            jx7Var2.getClass();
            fx7Var3.Q.remove(jx7Var2);
        }
        ex7 ex7Var5 = this.w;
        if (ex7Var5 != null) {
            fx7 fx7Var4 = ex7Var5.Q;
            jx7 jx7Var3 = this.t;
            jx7Var3.getClass();
            fx7Var4.R.remove(jx7Var3);
        }
        ex7 ex7Var6 = this.w;
        if (ex7Var6 != null && this.y == null) {
            fx7 fx7Var5 = ex7Var6.Q;
            kx7 kx7Var = this.u;
            kx7Var.getClass();
            fj0 fj0Var = fx7Var5.G;
            ((CopyOnWriteArrayList) fj0Var.G).remove(kx7Var);
            ij0.x(((HashMap) fj0Var.E).remove(kx7Var));
            ((Runnable) fj0Var.F).run();
        }
        this.w = null;
        this.x = null;
        this.y = null;
        if (this.g != null) {
            this.j.e();
            this.g = null;
        }
        ad adVar = this.C;
        if (adVar != null) {
            adVar.B();
            this.D.B();
            this.E.B();
        }
    }

    public final void m(boolean z) {
        if (z && this.w != null) {
            f0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (cx7 cx7Var : this.c.J()) {
            if (cx7Var != null) {
                cx7Var.i0 = true;
                if (z) {
                    cx7Var.Z.m(true);
                }
            }
        }
    }

    public final void n(boolean z) {
        if (z && this.w != null) {
            f0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (cx7 cx7Var : this.c.J()) {
            if (cx7Var != null && z) {
                cx7Var.Z.n(true);
            }
        }
    }

    public final void o() {
        for (cx7 cx7Var : this.c.G()) {
            if (cx7Var != null) {
                cx7Var.q();
                cx7Var.Z.o();
            }
        }
    }

    public final boolean p() {
        if (this.v >= 1) {
            for (cx7 cx7Var : this.c.J()) {
                if (cx7Var != null) {
                    if (!cx7Var.e0 ? cx7Var.Z.p() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.v < 1) {
            return;
        }
        for (cx7 cx7Var : this.c.J()) {
            if (cx7Var != null && !cx7Var.e0) {
                cx7Var.Z.q();
            }
        }
    }

    public final void r(cx7 cx7Var) {
        if (cx7Var != null) {
            if (cx7Var != this.c.C(cx7Var.I)) {
                return;
            }
            cx7Var.X.getClass();
            boolean zN = N(cx7Var);
            Boolean bool = cx7Var.N;
            if (bool == null || bool.booleanValue() != zN) {
                cx7Var.N = Boolean.valueOf(zN);
                rx7 rx7Var = cx7Var.Z;
                rx7Var.g0();
                rx7Var.r(rx7Var.z);
            }
        }
    }

    public final void s(boolean z) {
        if (z && this.w != null) {
            f0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (cx7 cx7Var : this.c.J()) {
            if (cx7Var != null && z) {
                cx7Var.Z.s(true);
            }
        }
    }

    public final boolean t() {
        if (this.v < 1) {
            return false;
        }
        boolean z = false;
        for (cx7 cx7Var : this.c.J()) {
            if (cx7Var != null && M(cx7Var)) {
                if (!cx7Var.e0 ? cx7Var.Z.t() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(FreeTypeConstants.FT_LOAD_PEDANTIC);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        cx7 cx7Var = this.y;
        if (cx7Var != null) {
            sb.append(cx7Var.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.y)));
            sb.append("}");
        } else {
            ex7 ex7Var = this.w;
            if (ex7Var != null) {
                sb.append(ex7Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.w)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i) {
        try {
            this.b = true;
            for (wx7 wx7Var : ((HashMap) this.c.G).values()) {
                if (wx7Var != null) {
                    wx7Var.p(i);
                }
            }
            P(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((yt5) it.next()).e();
            }
            this.b = false;
            A(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void v() {
        if (this.K) {
            this.K = false;
            e0();
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2;
        String strO = kgh.o(str, "    ");
        dpf dpfVar = this.c;
        ArrayList arrayList = (ArrayList) dpfVar.F;
        String strO2 = kgh.o(str, "    ");
        HashMap map = (HashMap) dpfVar.G;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (wx7 wx7Var : map.values()) {
                printWriter.print(str);
                if (wx7Var != null) {
                    cx7 cx7VarJ = wx7Var.j();
                    printWriter.println(cx7VarJ);
                    cx7VarJ.getClass();
                    printWriter.print(strO2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(cx7VarJ.b0));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(cx7VarJ.c0));
                    printWriter.print(" mTag=");
                    printWriter.println(cx7VarJ.d0);
                    printWriter.print(strO2);
                    printWriter.print("mState=");
                    printWriter.print(cx7VarJ.E);
                    printWriter.print(" mWho=");
                    printWriter.print(cx7VarJ.I);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(cx7VarJ.W);
                    printWriter.print(strO2);
                    printWriter.print("mAdded=");
                    printWriter.print(cx7VarJ.O);
                    printWriter.print(" mRemoving=");
                    printWriter.print(cx7VarJ.P);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(cx7VarJ.R);
                    printWriter.print(" mInLayout=");
                    printWriter.println(cx7VarJ.S);
                    printWriter.print(strO2);
                    printWriter.print("mHidden=");
                    printWriter.print(cx7VarJ.e0);
                    printWriter.print(" mDetached=");
                    printWriter.print(cx7VarJ.f0);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(cx7VarJ.h0);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(strO2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(cx7VarJ.g0);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(cx7VarJ.l0);
                    if (cx7VarJ.X != null) {
                        printWriter.print(strO2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(cx7VarJ.X);
                    }
                    if (cx7VarJ.Y != null) {
                        printWriter.print(strO2);
                        printWriter.print("mHost=");
                        printWriter.println(cx7VarJ.Y);
                    }
                    if (cx7VarJ.a0 != null) {
                        printWriter.print(strO2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(cx7VarJ.a0);
                    }
                    if (cx7VarJ.J != null) {
                        printWriter.print(strO2);
                        printWriter.print("mArguments=");
                        printWriter.println(cx7VarJ.J);
                    }
                    if (cx7VarJ.F != null) {
                        printWriter.print(strO2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(cx7VarJ.F);
                    }
                    if (cx7VarJ.G != null) {
                        printWriter.print(strO2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(cx7VarJ.G);
                    }
                    if (cx7VarJ.H != null) {
                        printWriter.print(strO2);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(cx7VarJ.H);
                    }
                    Object objC = cx7VarJ.K;
                    if (objC == null) {
                        rx7 rx7Var = cx7VarJ.X;
                        objC = (rx7Var == null || (str2 = cx7VarJ.L) == null) ? null : rx7Var.c.C(str2);
                    }
                    if (objC != null) {
                        printWriter.print(strO2);
                        printWriter.print("mTarget=");
                        printWriter.print(objC);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(cx7VarJ.M);
                    }
                    printWriter.print(strO2);
                    printWriter.print("mPopDirection=");
                    bx7 bx7Var = cx7VarJ.m0;
                    printWriter.println(bx7Var == null ? false : bx7Var.a);
                    bx7 bx7Var2 = cx7VarJ.m0;
                    if ((bx7Var2 == null ? 0 : bx7Var2.b) != 0) {
                        printWriter.print(strO2);
                        printWriter.print("getEnterAnim=");
                        bx7 bx7Var3 = cx7VarJ.m0;
                        printWriter.println(bx7Var3 == null ? 0 : bx7Var3.b);
                    }
                    bx7 bx7Var4 = cx7VarJ.m0;
                    if ((bx7Var4 == null ? 0 : bx7Var4.c) != 0) {
                        printWriter.print(strO2);
                        printWriter.print("getExitAnim=");
                        bx7 bx7Var5 = cx7VarJ.m0;
                        printWriter.println(bx7Var5 == null ? 0 : bx7Var5.c);
                    }
                    bx7 bx7Var6 = cx7VarJ.m0;
                    if ((bx7Var6 == null ? 0 : bx7Var6.d) != 0) {
                        printWriter.print(strO2);
                        printWriter.print("getPopEnterAnim=");
                        bx7 bx7Var7 = cx7VarJ.m0;
                        printWriter.println(bx7Var7 == null ? 0 : bx7Var7.d);
                    }
                    bx7 bx7Var8 = cx7VarJ.m0;
                    if ((bx7Var8 == null ? 0 : bx7Var8.e) != 0) {
                        printWriter.print(strO2);
                        printWriter.print("getPopExitAnim=");
                        bx7 bx7Var9 = cx7VarJ.m0;
                        printWriter.println(bx7Var9 == null ? 0 : bx7Var9.e);
                    }
                    if (cx7VarJ.j0 != null) {
                        printWriter.print(strO2);
                        printWriter.print("mContainer=");
                        printWriter.println(cx7VarJ.j0);
                    }
                    if (cx7VarJ.j() != null) {
                        i49.E0(cx7VarJ).z0(strO2, printWriter);
                    }
                    printWriter.print(strO2);
                    printWriter.println("Child " + cx7VarJ.Z + ":");
                    cx7VarJ.Z.w(strO2.concat("  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                cx7 cx7Var = (cx7) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(cx7Var.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                cx7 cx7Var2 = (cx7) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(cx7Var2.toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                tb1 tb1Var = (tb1) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(tb1Var.toString());
                tb1Var.g(strO, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.k.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (ox7) this.a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.x);
        if (this.y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.H);
        printWriter.print(" mStopped=");
        printWriter.print(this.I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.J);
        if (this.G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.G);
        }
    }

    public final void x() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((yt5) it.next()).e();
        }
    }

    public final void y(ox7 ox7Var, boolean z) {
        if (!z) {
            if (this.w == null) {
                if (this.J) {
                    sz6.j("FragmentManager has been destroyed");
                    return;
                } else {
                    sz6.j("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (O()) {
                sz6.j("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.a) {
            try {
                if (this.w == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(ox7Var);
                    Y();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(boolean z) {
        if (this.b) {
            sz6.j("FragmentManager is already executing transactions");
            return;
        }
        if (this.w == null) {
            if (this.J) {
                sz6.j("FragmentManager has been destroyed");
                return;
            } else {
                sz6.j("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.w.O.getLooper()) {
            sz6.j("Must be called from main thread of fragment host");
            return;
        }
        if (!z && O()) {
            sz6.j("Can not perform this action after onSaveInstanceState");
        } else if (this.L == null) {
            this.L = new ArrayList();
            this.M = new ArrayList();
        }
    }
}
