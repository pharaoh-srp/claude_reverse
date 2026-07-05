package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class ix7 implements LayoutInflater.Factory2 {
    public final rx7 E;

    public ix7(rx7 rx7Var) {
        this.E = rx7Var;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        wx7 wx7VarG;
        boolean zEquals = hx7.class.getName().equals(str);
        rx7 rx7Var = this.E;
        if (zEquals) {
            return new hx7(context, attributeSet, rx7Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q0e.a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = cx7.class.isAssignableFrom(lx7.b(attributeValue, context.getClassLoader()));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    cx7 cx7VarC = resourceId != -1 ? rx7Var.C(resourceId) : null;
                    if (cx7VarC == null && string != null) {
                        cx7VarC = rx7Var.D(string);
                    }
                    if (cx7VarC == null && id != -1) {
                        cx7VarC = rx7Var.C(id);
                    }
                    if (cx7VarC == null) {
                        lx7 lx7VarG = rx7Var.G();
                        context.getClassLoader();
                        cx7VarC = lx7VarG.a(attributeValue);
                        cx7VarC.R = true;
                        cx7VarC.b0 = resourceId != 0 ? resourceId : id;
                        cx7VarC.c0 = id;
                        cx7VarC.d0 = string;
                        cx7VarC.S = true;
                        cx7VarC.X = rx7Var;
                        ex7 ex7Var = rx7Var.w;
                        cx7VarC.Y = ex7Var;
                        fx7 fx7Var = ex7Var.N;
                        cx7VarC.i0 = true;
                        if ((ex7Var == null ? null : ex7Var.M) != null) {
                            cx7VarC.i0 = true;
                        }
                        wx7VarG = rx7Var.a(cx7VarC);
                        if (rx7.J(2)) {
                            Log.v("FragmentManager", "Fragment " + cx7VarC + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (cx7VarC.S) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        cx7VarC.S = true;
                        cx7VarC.X = rx7Var;
                        ex7 ex7Var2 = rx7Var.w;
                        cx7VarC.Y = ex7Var2;
                        fx7 fx7Var2 = ex7Var2.N;
                        cx7VarC.i0 = true;
                        if ((ex7Var2 == null ? null : ex7Var2.M) != null) {
                            cx7VarC.i0 = true;
                        }
                        wx7VarG = rx7Var.g(cx7VarC);
                        if (rx7.J(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + cx7VarC + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    yx7.d(cx7VarC, viewGroup);
                    cx7VarC.j0 = viewGroup;
                    wx7VarG.k();
                    wx7VarG.i();
                    sz6.j(ij0.j("Fragment ", attributeValue, " did not create a view."));
                    return null;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
