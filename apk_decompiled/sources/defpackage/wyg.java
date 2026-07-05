package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes2.dex */
public final class wyg {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ xyg E;
    public final Menu a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public ddb z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public wyg(xyg xygVar, Menu menu) {
        this.E = xygVar;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        xyg xygVar = this.E;
        Context context = xygVar.c;
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.y != null) {
            if (context.isRestricted()) {
                sz6.j("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            if (xygVar.d == null) {
                xygVar.d = xyg.a(context);
            }
            Object obj = xygVar.d;
            String str = this.y;
            vyg vygVar = new vyg();
            vygVar.b = obj;
            Class<?> cls = obj.getClass();
            try {
                vygVar.c = cls.getMethod(str, vyg.d);
                menuItem.setOnMenuItemClickListener(vygVar);
            } catch (Exception e) {
                StringBuilder sbX = sq6.x("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbX.append(cls.getName());
                InflateException inflateException = new InflateException(sbX.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof adb) {
                adb adbVar = (adb) menuItem;
                adbVar.x = (adbVar.x & (-5)) | 4;
            } else if (menuItem instanceof gdb) {
                gdb gdbVar = (gdb) menuItem;
                yyg yygVar = gdbVar.c;
                try {
                    if (gdbVar.d == null) {
                        gdbVar.d = yygVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    gdbVar.d.invoke(yygVar, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str2 = this.x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, xyg.e, xygVar.a));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ddb ddbVar = this.z;
        if (ddbVar != null) {
            if (menuItem instanceof yyg) {
                ((yyg) menuItem).a(ddbVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z2 = menuItem instanceof yyg;
        if (z2) {
            ((yyg) menuItem).setContentDescription(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z2) {
            ((yyg) menuItem).setTooltipText(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z2) {
            ((yyg) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            menuItem.setAlphabeticShortcut(c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((yyg) menuItem).setNumericShortcut(c2, i4);
        } else {
            menuItem.setNumericShortcut(c2, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z2) {
                ((yyg) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z2) {
                ((yyg) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}
