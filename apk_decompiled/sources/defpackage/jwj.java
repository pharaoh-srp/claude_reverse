package defpackage;

import android.graphics.Canvas;
import android.os.Build;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.MessageDocumentFile;
import com.pvporbit.freetype.FreeTypeConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jwj {
    public static final ta4 a = new ta4(1435262577, false, new ya4(2));
    public static final ta4 b = new ta4(401324691, false, new ya4(3));
    public static final ta4 c = new ta4(1147912441, false, new ya4(4));
    public static final Object d = new Object();
    public static Method e;
    public static Method f;
    public static boolean g;

    public static final void a(MessageDocumentFile messageDocumentFile, String str, hed hedVar, zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        zy7 zy7Var2;
        ta4 ta4Var;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-110611313);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(messageDocumentFile) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(hedVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            zy7Var2 = zy7Var;
            i2 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            zy7Var2 = zy7Var;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            r4g r4gVarS = gb9.S(u4g.G, null, null, zy7Var2, e18Var, (i2 & 7168) | 6, 6);
            String file_name = messageDocumentFile.getFile_name();
            ta4 ta4VarQ0 = null;
            if (str == null) {
                e18Var.a0(-981278836);
                e18Var.p(false);
                ta4Var = null;
            } else {
                e18Var.a0(-981278835);
                ta4 ta4VarQ02 = fd9.q0(388604262, new yi7(str, 22), e18Var);
                e18Var.p(false);
                ta4Var = ta4VarQ02;
            }
            ta4 ta4VarQ03 = fd9.q0(750737562, new u22(r4gVarS, 12), e18Var);
            if ((hedVar.b instanceof cj7) && ((Boolean) hedVar.h.getValue()).booleanValue()) {
                e18Var.a0(-981074576);
                ta4VarQ0 = fd9.q0(1328104517, new ked(hedVar, messageDocumentFile), e18Var);
                e18Var.p(false);
            } else {
                e18Var.a0(-980695849);
                e18Var.p(false);
            }
            auj.b(r4gVarS, file_name, null, null, false, null, null, null, ta4Var, ta4VarQ03, null, ta4VarQ0, fd9.q0(-1299394487, new ked(messageDocumentFile, hedVar), e18Var), e18Var, 805306376, 384, 1276);
            e18Var = e18Var;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bg6(messageDocumentFile, str, hedVar, zy7Var, i, 15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(MessageDocumentFile messageDocumentFile, ej7 ej7Var, zy7 zy7Var, hed hedVar, ld4 ld4Var, int i) {
        int i2;
        hed hedVar2;
        int i3;
        hed hedVar3;
        messageDocumentFile.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2103965812);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(messageDocumentFile) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(ej7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i4 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            e18Var.V();
            int i5 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var.A()) {
                int i6 = i2 >> 3;
                m7f m7fVar = (m7f) e18Var.j(gr9.b);
                boolean zH = ((((i6 & 14) ^ 6) > 4 && e18Var.f(ej7Var)) || (i6 & 6) == 4) | e18Var.h(m7fVar);
                Object objN = e18Var.N();
                if (zH || objN == lz1Var) {
                    objN = new b4b(ej7Var, 17, m7fVar);
                    e18Var.k0(objN);
                }
                kce kceVar = jce.a;
                i3 = i2 & (-7169);
                hedVar3 = (hed) fd9.r0(kceVar.b(hed.class), oq5.B(kceVar.b(hed.class)), (bz7) objN, e18Var);
            } else {
                e18Var.T();
                i3 = i2 & (-7169);
                hedVar3 = hedVar;
            }
            int i7 = i3;
            e18Var.q();
            lwj.j(ej7Var, messageDocumentFile.mo236getFile_uuidExWXDbg(), "document", null, e18Var, (i7 >> 3) & 14);
            e18Var = e18Var;
            String strJ0 = d4c.j0(R.string.document_preview_bottom_sheet_snackbar_download_started, e18Var);
            String strJ02 = d4c.j0(R.string.document_preview_bottom_sheet_snackbar_download_error, e18Var);
            zy1 zy1Var = hedVar3.f;
            boolean zF = e18Var.f(hedVar3) | e18Var.f(strJ0) | e18Var.f(strJ02);
            Object objN2 = e18Var.N();
            String strF0 = null;
            Object[] objArr = 0;
            if (zF || objN2 == lz1Var) {
                lza lzaVar = new lza((Object) hedVar3, (Object) strJ0, (Object) strJ02, (tp4) (objArr == true ? 1 : 0), 8);
                hedVar2 = hedVar3;
                e18Var.k0(lzaVar);
                objN2 = lzaVar;
            } else {
                hedVar2 = hedVar3;
            }
            x44.b(zy1Var, (pz7) objN2, e18Var, 0);
            Integer page_count = messageDocumentFile.getDocument_asset().getPage_count();
            if (page_count == null || page_count.intValue() <= 0) {
                page_count = null;
            }
            if (page_count == null) {
                e18Var.a0(-1506202706);
                e18Var.p(false);
            } else {
                e18Var.a0(-1506202705);
                int iIntValue = page_count.intValue();
                strF0 = d4c.f0(R.plurals.document_preview_bottom_sheet_page_count, iIntValue, new Object[]{Integer.valueOf(iIntValue)}, e18Var);
                e18Var.p(false);
            }
            String str = strF0;
            if (ikb.a(messageDocumentFile.getFile_name()).equals("pdf")) {
                e18Var.a0(-1505515218);
                String url = messageDocumentFile.getDocument_asset().getUrl();
                boolean z = true;
                String file_name = messageDocumentFile.getFile_name();
                boolean z2 = (hedVar2.b instanceof cj7) && ((Boolean) hedVar2.h.getValue()).booleanValue();
                boolean zF2 = e18Var.f(hedVar2);
                if ((i7 & 14) != 4) {
                    z = false;
                }
                boolean z3 = z | zF2;
                Object objN3 = e18Var.N();
                if (z3 || objN3 == lz1Var) {
                    objN3 = new jed(hedVar2, messageDocumentFile, i4);
                    e18Var.k0(objN3);
                }
                zy7 zy7Var2 = (zy7) objN3;
                Object objN4 = e18Var.N();
                if (objN4 == lz1Var) {
                    objN4 = new oob(19);
                    e18Var.k0(objN4);
                }
                qwj.b(url, file_name, z2, false, zy7Var2, zy7Var, (zy7) objN4, null, str, hedVar2.g, null, e18Var, ((i7 << 9) & 458752) | 1575936, 1152);
                e18Var.p(false);
            } else {
                e18Var.a0(-1504980344);
                a(messageDocumentFile, str, hedVar2, zy7Var, e18Var, (i7 & 14) | ((i7 << 3) & 7168));
                e18Var.p(false);
            }
        } else {
            e18Var.T();
            hedVar2 = hedVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bg6(messageDocumentFile, ej7Var, zy7Var, hedVar2, i, 14);
        }
    }

    public static final void c(int i, int i2) {
        if (i < 0 || i >= i2) {
            xh6.j(grc.o(i, i2, "index: ", ", size: "));
        }
    }

    public static final void d(int i, int i2) {
        if (i < 0 || i > i2) {
            xh6.j(grc.o(i, i2, "index: ", ", size: "));
        }
    }

    public static final void e(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            mr9.e(i3, vb7.v("fromIndex: ", ", toIndex: ", i, i2, ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            sz6.p(grc.o(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    public static final Object f(jgg jggVar, int i) {
        Object obj;
        jggVar.getClass();
        int iH = sf5.h(jggVar.G, i, jggVar.E);
        if (iH < 0 || (obj = jggVar.F[iH]) == d) {
            return null;
        }
        return obj;
    }

    public static void g(Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!g) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    e = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    e = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = e;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            g = true;
        }
        if (z) {
            try {
                Method method4 = e;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = f) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static ds6 h(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("id").m();
            bh9 bh9VarS = qh9Var.s("name");
            String strM2 = bh9VarS != null ? bh9VarS.m() : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((m7a) qh9Var.E.entrySet()).iterator();
            while (((o7a) it).hasNext()) {
                p7a p7aVarA = ((l7a) it).a();
                if (!mp0.o0(p7aVarA.getKey(), ds6.d)) {
                    Object key = p7aVarA.getKey();
                    key.getClass();
                    linkedHashMap.put(key, p7aVarA.getValue());
                }
            }
            strM.getClass();
            return new ds6(strM, strM2, linkedHashMap);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Account", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Account", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Account", e4);
            return null;
        }
    }

    public static xvi i(qh9 qh9Var) {
        try {
            yvi yviVarI = kwj.i(qh9Var.s("view").g());
            String strM = qh9Var.s("source").m();
            strM.getClass();
            for (int i : sq6.H(11)) {
                if (kgh.j(i).equals(strM)) {
                    return new xvi(yviVarI, i);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Container", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Container", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Container", e4);
            return null;
        }
    }
}
