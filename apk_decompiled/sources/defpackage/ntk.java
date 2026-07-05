package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.anthropic.claude.R;
import com.anthropic.claude.artifact.dialog.PublishArtifactParams;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ntk {
    public static final ta4 a = new ta4(-372715529, false, new xb4(21));
    public static final ta4 b = new ta4(-1355708906, false, new xb4(22));
    public static final ta4 c = new ta4(1882556986, false, new wb4(18));
    public static final ta4 d = new ta4(978221201, false, new wb4(19));
    public static py8 e;
    public static py8 f;

    public static final void a(PublishArtifactParams publishArtifactParams, zy7 zy7Var, qi3 qi3Var, ld4 ld4Var, int i) {
        qi3 qi3Var2;
        qi3 qi3Var3;
        int i2;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2055366794);
        int i3 = i | (e18Var.f(publishArtifactParams) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | FreeTypeConstants.FT_LOAD_PEDANTIC;
        int i4 = 1;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            e18Var.V();
            int i5 = i & 1;
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(qi3.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                qi3Var3 = (qi3) objN;
                i2 = i3 & (-897);
            } else {
                e18Var.T();
                i2 = i3 & (-897);
                qi3Var3 = qi3Var;
            }
            e18Var.q();
            boolean zH = e18Var.h(qi3Var3);
            Object objN2 = e18Var.N();
            int i6 = 6;
            if (zH || objN2 == lz1Var) {
                objN2 = new gw(qi3Var3, tp4Var, i6);
                e18Var.k0(objN2);
            }
            csg.g((bz7) objN2, e18Var, 0, 1);
            m7f m7fVar = (m7f) e18Var.j(gr9.b);
            boolean zH2 = e18Var.h(m7fVar) | ((((i2 & 14) ^ 6) > 4 && e18Var.f(publishArtifactParams)) || (i2 & 6) == 4);
            Object objN3 = e18Var.N();
            if (zH2 || objN3 == lz1Var) {
                objN3 = new b4b(m7fVar, 22, publishArtifactParams);
                e18Var.k0(objN3);
            }
            kce kceVar = jce.a;
            pwd pwdVar = (pwd) fd9.r0(kceVar.b(pwd.class), oq5.B(kceVar.b(pwd.class)), (bz7) objN3, e18Var);
            r4g r4gVarS = gb9.S(u4g.F, null, null, zy7Var, e18Var, ((i2 << 6) & 7168) | 6, 6);
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var) {
                objN4 = sq6.p(e18Var);
            }
            ybg ybgVar = (ybg) objN4;
            vkc.a(r4gVarS, d4c.j0(R.string.artifact_share_sheet_title, e18Var), null, null, false, false, null, null, null, null, null, ybgVar, fd9.q0(-1563306021, new xu(pwdVar, i4, publishArtifactParams), e18Var), e18Var, 8, 3456, 4092);
            e18Var = e18Var;
            zni.g(pwdVar.k, ybgVar, e18Var, 48);
            qi3Var2 = qi3Var3;
        } else {
            e18Var.T();
            qi3Var2 = qi3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m6(i, 9, publishArtifactParams, zy7Var, qi3Var2, false);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String b(defpackage.rvh r10, defpackage.ld4 r11, int r12) {
        /*
            Method dump skipped, instruction units count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ntk.b(rvh, ld4, int):java.lang.String");
    }

    public static k3f c(byte[] bArr, Parcelable.Creator creator) {
        dgj.v(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        k3f k3fVar = (k3f) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return k3fVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final l46 d(rvh rvhVar) {
        String content;
        l46 l46Var;
        rvhVar.getClass();
        Map map = rvhVar.d;
        if (rvhVar.f == qvh.F) {
            int i = 0;
            switch (h(rvhVar).ordinal()) {
                case 0:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    break;
                case 1:
                case 2:
                    Object obj = map.get("file_path");
                    JsonPrimitive jsonPrimitive = obj instanceof JsonPrimitive ? (JsonPrimitive) obj : null;
                    if (jsonPrimitive == null || (content = jsonPrimitive.getContent()) == null) {
                        content = "";
                    }
                    Iterator it = bwh.g(rvhVar, content).a.iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        Iterator it2 = ((fi7) it.next()).d.iterator();
                        while (it2.hasNext()) {
                            Iterator it3 = ((l36) it2.next()).f.iterator();
                            while (it3.hasNext()) {
                                int iOrdinal = ((n36) it3.next()).a.ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal == 1) {
                                        i++;
                                    } else if (iOrdinal != 2) {
                                        wg6.i();
                                    } else {
                                        i2++;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    l46Var = new l46(i, i2);
                    if (l46Var.a == 0 || l46Var.b != 0) {
                    }
                    break;
                case 3:
                    if (!x44.r(k(rvhVar), "update")) {
                        Object obj2 = map.get("content");
                        JsonPrimitive jsonPrimitive2 = obj2 instanceof JsonPrimitive ? (JsonPrimitive) obj2 : null;
                        String content2 = jsonPrimitive2 != null ? jsonPrimitive2.getContent() : null;
                        if (content2 != null && content2.length() != 0) {
                            l46Var = new l46(w48.d(content2).size(), 0);
                            if (l46Var.a == 0) {
                            }
                        }
                    }
                    break;
                default:
                    wg6.i();
                    break;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        r1 = defpackage.tpk.g(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r1 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        return r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        r0 = r0.get("description");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        if ((r0 instanceof kotlinx.serialization.json.JsonPrimitive) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        r0 = (kotlinx.serialization.json.JsonPrimitive) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        r4 = r0.getContent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        if (r4 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (defpackage.bsg.I0(r4) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String e(defpackage.rvh r5) {
        /*
            r5.getClass()
            java.util.Map r0 = r5.d
            java.lang.String r1 = r5.c
            int r2 = r1.hashCode()
            r3 = -1901909558(0xffffffff8ea329ca, float:-4.0222844E-30)
            r4 = 0
            if (r2 == r3) goto L54
            r3 = 2063092(0x1f7af4, float:2.891008E-39)
            if (r2 == r3) goto L25
            r3 = 3496815(0x355b6f, float:4.900081E-39)
            if (r2 == r3) goto L1c
            goto L5c
        L1c:
            java.lang.String r2 = "repl"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L2d
            goto L5c
        L25:
            java.lang.String r2 = "Bash"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5c
        L2d:
            p58 r1 = defpackage.tpk.g(r5)
            if (r1 == 0) goto L36
            java.lang.String r5 = r1.b
            return r5
        L36:
            java.lang.String r1 = "description"
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof kotlinx.serialization.json.JsonPrimitive
            if (r1 == 0) goto L43
            kotlinx.serialization.json.JsonPrimitive r0 = (kotlinx.serialization.json.JsonPrimitive) r0
            goto L44
        L43:
            r0 = r4
        L44:
            if (r0 == 0) goto L4a
            java.lang.String r4 = r0.getContent()
        L4a:
            if (r4 == 0) goto L5c
            boolean r0 = defpackage.bsg.I0(r4)
            if (r0 == 0) goto L53
            goto L5c
        L53:
            return r4
        L54:
            java.lang.String r2 = "AskUserQuestion"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L61
        L5c:
            java.lang.String r5 = defpackage.bwh.d(r5)
            return r5
        L61:
            java.lang.String r5 = "questions"
            java.lang.Object r5 = r0.get(r5)
            boolean r0 = r5 instanceof kotlinx.serialization.json.JsonArray
            if (r0 == 0) goto L6e
            kotlinx.serialization.json.JsonArray r5 = (kotlinx.serialization.json.JsonArray) r5
            goto L6f
        L6e:
            r5 = r4
        L6f:
            if (r5 == 0) goto L78
            java.lang.Object r5 = defpackage.w44.N0(r5)
            kotlinx.serialization.json.JsonElement r5 = (kotlinx.serialization.json.JsonElement) r5
            goto L79
        L78:
            r5 = r4
        L79:
            boolean r0 = r5 instanceof kotlinx.serialization.json.JsonObject
            if (r0 == 0) goto L80
            kotlinx.serialization.json.JsonObject r5 = (kotlinx.serialization.json.JsonObject) r5
            goto L81
        L80:
            r5 = r4
        L81:
            if (r5 == 0) goto L9c
            java.lang.String r0 = "header"
            java.lang.Object r5 = r5.get(r0)
            kotlinx.serialization.json.JsonElement r5 = (kotlinx.serialization.json.JsonElement) r5
            if (r5 == 0) goto L9c
            boolean r0 = r5 instanceof kotlinx.serialization.json.JsonPrimitive
            if (r0 == 0) goto L94
            kotlinx.serialization.json.JsonPrimitive r5 = (kotlinx.serialization.json.JsonPrimitive) r5
            goto L95
        L94:
            r5 = r4
        L95:
            if (r5 == 0) goto L9c
            java.lang.String r5 = r5.getContent()
            return r5
        L9c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ntk.e(rvh):java.lang.String");
    }

    public static final boolean f(long j, long j2) {
        return j == j2;
    }

    public static final List g(List list, e18 e18Var) {
        int i;
        e18Var.a0(-1502702732);
        if (list.isEmpty()) {
            e18Var.p(false);
            return lm6.E;
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            rvh rvhVar = (rvh) it.next();
            cwh cwhVarH = h(rvhVar);
            Object linkedHashSet = linkedHashMap.get(cwhVarH);
            if (linkedHashSet == null) {
                arrayList.add(cwhVarH);
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(cwhVarH, linkedHashSet);
            }
            Collection collection = (Collection) linkedHashSet;
            String strJ = j(rvhVar);
            if (strJ == null) {
                strJ = rvhVar.a;
            }
            collection.add(strJ);
            if (rvhVar.f != qvh.G) {
                z = false;
            }
            linkedHashMap2.put(cwhVarH, Boolean.valueOf(z));
        }
        List listJ1 = w44.j1(arrayList, 3);
        ArrayList arrayList2 = new ArrayList(x44.y(listJ1, 10));
        int i2 = 0;
        for (Object obj : listJ1) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                x44.n0();
                throw null;
            }
            cwh cwhVar = (cwh) obj;
            Set set = (Set) linkedHashMap.get(cwhVar);
            int size = set != null ? set.size() : 0;
            switch (cwhVar.ordinal()) {
                case 0:
                    i = R.plurals.ccr_summary_read;
                    break;
                case 1:
                    i = R.plurals.ccr_summary_edit;
                    break;
                case 2:
                    i = R.plurals.ccr_summary_notebook_edit;
                    break;
                case 3:
                    i = R.plurals.ccr_summary_write;
                    break;
                case 4:
                    i = R.plurals.ccr_summary_bash;
                    break;
                case 5:
                    i = R.plurals.ccr_summary_grep;
                    break;
                case 6:
                    i = R.plurals.ccr_summary_glob;
                    break;
                case 7:
                    i = R.plurals.ccr_summary_web;
                    break;
                case 8:
                    i = R.plurals.ccr_summary_todo;
                    break;
                case 9:
                    i = R.plurals.ccr_summary_task;
                    break;
                case 10:
                    i = R.plurals.ccr_summary_proposed_plan;
                    break;
                case 11:
                    i = R.plurals.ccr_summary_other;
                    break;
                default:
                    wg6.i();
                    return null;
            }
            String strF0 = d4c.f0(i, size, new Object[]{Integer.valueOf(size)}, e18Var);
            if (i2 != 0 && strF0.length() > 0) {
                StringBuilder sb = new StringBuilder();
                String strValueOf = String.valueOf(strF0.charAt(0));
                strValueOf.getClass();
                String lowerCase = strValueOf.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                sb.append((Object) lowerCase);
                sb.append(strF0.substring(1));
                strF0 = sb.toString();
            }
            arrayList2.add(new eb8(strF0, x44.r(linkedHashMap2.get(cwhVar), Boolean.TRUE)));
            i2 = i3;
        }
        e18Var.p(false);
        return arrayList2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r1.equals("web_search") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r1.equals("WebSearch") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (r1.equals("MultiEdit") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
    
        if (r1.equals("Agent") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
    
        if (r1.equals("repl") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0074, code lost:
    
        if (r1.equals("Task") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007a, code lost:
    
        return defpackage.cwh.O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a5, code lost:
    
        if (r1.equals("Edit") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00aa, code lost:
    
        return defpackage.cwh.G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b1, code lost:
    
        if (r1.equals("Bash") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b6, code lost:
    
        return defpackage.cwh.J;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00bd, code lost:
    
        if (r1.equals("WebFetch") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r1.equals("str_replace") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c6, code lost:
    
        if (r1.equals("web_fetch") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00cb, code lost:
    
        return defpackage.cwh.M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r1.equals("str_replace_based_edit_tool") == false) goto L81;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.cwh h(defpackage.rvh r1) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ntk.h(rvh):cwh");
    }

    public static final boolean i(rvh rvhVar) {
        rvhVar.getClass();
        switch (h(rvhVar).ordinal()) {
            case 4:
                if (tpk.g(rvhVar) == null) {
                    Object obj = rvhVar.d.get("description");
                    JsonPrimitive jsonPrimitive = obj instanceof JsonPrimitive ? (JsonPrimitive) obj : null;
                    String content = jsonPrimitive != null ? jsonPrimitive.getContent() : null;
                    if (content != null && !bsg.I0(content)) {
                        return false;
                    }
                }
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
                return true;
            default:
                wg6.i();
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return false;
        }
    }

    public static final String j(rvh rvhVar) {
        String content;
        rvhVar.getClass();
        Map map = rvhVar.d;
        switch (h(rvhVar).ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
                Object obj = map.get("file_path");
                JsonPrimitive jsonPrimitive = obj instanceof JsonPrimitive ? (JsonPrimitive) obj : null;
                if (jsonPrimitive != null && (content = jsonPrimitive.getContent()) != null) {
                    return content;
                }
                Object obj2 = map.get("path");
                JsonPrimitive jsonPrimitive2 = obj2 instanceof JsonPrimitive ? (JsonPrimitive) obj2 : null;
                if (jsonPrimitive2 != null) {
                    return jsonPrimitive2.getContent();
                }
                Object obj3 = map.get("notebook_path");
                JsonPrimitive jsonPrimitive3 = obj3 instanceof JsonPrimitive ? (JsonPrimitive) obj3 : null;
                if (jsonPrimitive3 != null) {
                    return jsonPrimitive3.getContent();
                }
                return null;
            default:
                wg6.i();
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return null;
        }
    }

    public static final String k(rvh rvhVar) {
        rvhVar.getClass();
        if (!x44.r(rvhVar.c, "Write")) {
            return null;
        }
        JsonElement jsonElement = rvhVar.h;
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        JsonElement jsonElement2 = jsonObject != null ? (JsonElement) jsonObject.get((Object) "type") : null;
        JsonPrimitive jsonPrimitive = jsonElement2 instanceof JsonPrimitive ? (JsonPrimitive) jsonElement2 : null;
        if (jsonPrimitive != null) {
            return ch9.f(jsonPrimitive);
        }
        return null;
    }

    public static String l(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + kpk.i(Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + kpk.i(Float.intBitsToFloat(i)) + ", " + kpk.i(Float.intBitsToFloat(i2)) + ')';
    }
}
