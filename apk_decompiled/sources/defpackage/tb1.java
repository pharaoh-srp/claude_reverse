package defpackage;

import android.util.Log;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class tb1 implements ox7 {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;
    public int i;
    public CharSequence j;
    public int k;
    public CharSequence l;
    public ArrayList m;
    public ArrayList n;
    public boolean o;
    public ArrayList p;
    public final rx7 q;
    public boolean r;
    public int s;

    public tb1(rx7 rx7Var) {
        rx7Var.G();
        ex7 ex7Var = rx7Var.w;
        if (ex7Var != null) {
            ex7Var.N.getClassLoader();
        }
        this.a = new ArrayList();
        this.o = false;
        this.s = -1;
        this.q = rx7Var;
    }

    @Override // defpackage.ox7
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (rx7.J(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        this.q.d.add(this);
        return true;
    }

    public final void b(zx7 zx7Var) {
        this.a.add(zx7Var);
        zx7Var.d = this.b;
        zx7Var.e = this.c;
        zx7Var.f = this.d;
        zx7Var.g = this.e;
    }

    public final void c(int i) {
        if (this.g) {
            if (rx7.J(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                zx7 zx7Var = (zx7) arrayList.get(i2);
                cx7 cx7Var = zx7Var.b;
                if (cx7Var != null) {
                    cx7Var.W += i;
                    if (rx7.J(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + zx7Var.b + " to " + zx7Var.b.W);
                    }
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            zx7 zx7Var = (zx7) arrayList.get(size);
            if (zx7Var.c) {
                if (zx7Var.a == 8) {
                    zx7Var.c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i = zx7Var.b.c0;
                    zx7Var.a = 2;
                    zx7Var.c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        zx7 zx7Var2 = (zx7) arrayList.get(i2);
                        if (zx7Var2.c && zx7Var2.b.c0 == i) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final int e(boolean z, boolean z2) {
        if (this.r) {
            sz6.j("commit already called");
            return 0;
        }
        if (rx7.J(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new xfa());
            g("  ", printWriter, true);
            printWriter.close();
        }
        this.r = true;
        boolean z3 = this.g;
        rx7 rx7Var = this.q;
        if (z3) {
            this.s = rx7Var.k.getAndIncrement();
        } else {
            this.s = -1;
        }
        if (z2) {
            rx7Var.y(this, z);
        }
        return this.s;
    }

    public final void f(int i, cx7 cx7Var, String str) {
        String str2 = cx7Var.p0;
        if (str2 != null) {
            yx7.c(cx7Var, str2);
        }
        Class<?> cls = cx7Var.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = cx7Var.d0;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(cx7Var);
                sb.append(": was ");
                sz6.j(kgh.q(sb, cx7Var.d0, " now ", str));
                return;
            }
            cx7Var.d0 = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + cx7Var + " with tag " + str + " to container view with no id");
            }
            int i2 = cx7Var.b0;
            if (i2 != 0 && i2 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(cx7Var);
                int i3 = cx7Var.b0;
                sb2.append(": was ");
                sb2.append(i3);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            cx7Var.b0 = i;
            cx7Var.c0 = i;
        }
        b(new zx7(1, cx7Var));
        cx7Var.X = this.q;
    }

    public final void g(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.i != 0 || this.j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (this.k != 0 || this.l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.l);
            }
        }
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zx7 zx7Var = (zx7) arrayList.get(i);
            switch (zx7Var.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + zx7Var.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(zx7Var.b);
            if (z) {
                if (zx7Var.d != 0 || zx7Var.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(zx7Var.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(zx7Var.e));
                }
                if (zx7Var.f != 0 || zx7Var.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(zx7Var.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(zx7Var.g));
                }
            }
        }
    }

    public final void h(cx7 cx7Var) {
        rx7 rx7Var = cx7Var.X;
        if (rx7Var == null || rx7Var == this.q) {
            b(new zx7(3, cx7Var));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + cx7Var.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(FreeTypeConstants.FT_LOAD_PEDANTIC);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
