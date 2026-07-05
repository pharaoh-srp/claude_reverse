package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class xyg extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public xyg(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        wyg wygVar = new wyg(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    pmf.o("Expecting menu, got ".concat(name));
                    return;
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                pmf.o("Unexpected end of document");
                return;
            }
            Menu menu2 = wygVar.a;
            if (eventType != i) {
                if (eventType != 3) {
                    xmlPullParser2 = xmlPullParser;
                    z = z;
                } else {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z2 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            wygVar.b = 0;
                            wygVar.c = 0;
                            wygVar.d = 0;
                            wygVar.e = 0;
                            wygVar.f = true;
                            wygVar.g = true;
                        } else if (name2.equals("item")) {
                            if (!wygVar.h) {
                                ddb ddbVar = wygVar.z;
                                if (ddbVar == null || !ddbVar.b.hasSubMenu()) {
                                    wygVar.h = true;
                                    wygVar.b(menu2.add(wygVar.b, wygVar.i, wygVar.j, wygVar.k));
                                } else {
                                    wygVar.h = true;
                                    wygVar.b(menu2.addSubMenu(wygVar.b, wygVar.i, wygVar.j, wygVar.k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z = true;
                        }
                        xmlPullParser2 = xmlPullParser;
                        z = z;
                    }
                }
                eventType = xmlPullParser2.next();
                i = 2;
                z = z;
                z2 = z2;
            } else {
                if (!z2) {
                    String name3 = xmlPullParser.getName();
                    boolean zEquals = name3.equals("group");
                    Context context = this.c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t0e.p);
                        wygVar.b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        wygVar.c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        wygVar.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        wygVar.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        wygVar.f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        wygVar.g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, t0e.q);
                            wygVar.i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            wygVar.j = (typedArrayObtainStyledAttributes2.getInt(5, wygVar.c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, wygVar.d) & 65535);
                            wygVar.k = typedArrayObtainStyledAttributes2.getText(7);
                            wygVar.l = typedArrayObtainStyledAttributes2.getText(8);
                            wygVar.m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            wygVar.n = string == null ? (char) 0 : string.charAt(0);
                            wygVar.o = typedArrayObtainStyledAttributes2.getInt(16, FreeTypeConstants.FT_LOAD_MONOCHROME);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            wygVar.p = string2 == null ? (char) 0 : string2.charAt(0);
                            wygVar.q = typedArrayObtainStyledAttributes2.getInt(20, FreeTypeConstants.FT_LOAD_MONOCHROME);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                wygVar.r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                wygVar.r = wygVar.e;
                            }
                            wygVar.s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            wygVar.t = typedArrayObtainStyledAttributes2.getBoolean(4, wygVar.f);
                            wygVar.u = typedArrayObtainStyledAttributes2.getBoolean(1, wygVar.g);
                            wygVar.v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            wygVar.y = typedArrayObtainStyledAttributes2.getString(12);
                            wygVar.w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            wygVar.x = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            boolean z3 = string3 != null;
                            if (z3 && wygVar.w == 0 && wygVar.x == null) {
                                wygVar.z = (ddb) wygVar.a(string3, f, this.b);
                            } else {
                                if (z3) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                wygVar.z = null;
                            }
                            wygVar.A = typedArrayObtainStyledAttributes2.getText(17);
                            wygVar.B = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                wygVar.D = je6.b(typedArrayObtainStyledAttributes2.getInt(19, -1), wygVar.D);
                            } else {
                                wygVar.D = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = x44.K(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                wygVar.C = colorStateList;
                            } else {
                                wygVar.C = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            wygVar.h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            wygVar.h = true;
                            SubMenu subMenuAddSubMenu = menu2.addSubMenu(wygVar.b, wygVar.i, wygVar.j, wygVar.k);
                            wygVar.b(subMenuAddSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, subMenuAddSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z = z;
                        z2 = z2;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z = z;
            }
            eventType = xmlPullParser2.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof vcb)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof vcb) {
                    vcb vcbVar = (vcb) menu;
                    if (!vcbVar.p) {
                        vcbVar.w();
                        z = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((vcb) menu).v();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((vcb) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
