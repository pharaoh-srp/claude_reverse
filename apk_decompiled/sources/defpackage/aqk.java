package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;
import com.anthropic.claude.api.mcp.McpServer;
import com.google.android.gms.internal.play_billing.d;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aqk {
    public static final ta4 a = new ta4(785444087, false, new ub4(19));

    public static int A(Object obj, klk klkVar, byte[] bArr, int i, int i2, po0 po0Var) {
        int iW = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iW = w(i3, bArr, iW, po0Var);
            i3 = po0Var.a;
        }
        int i4 = iW;
        if (i3 < 0 || i3 > i2 - i4) {
            poc.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i5 = po0Var.d + 1;
        po0Var.d = i5;
        if (i5 >= 100) {
            poc.s("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i6 = i4 + i3;
        klkVar.g(obj, bArr, i4, i6, po0Var);
        po0Var.d--;
        po0Var.c = obj;
        return i6;
    }

    public static long B(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static final void a(List list, String str, zy7 zy7Var, String str2, ld4 ld4Var, int i) {
        int i2;
        Object next;
        list.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1312812850);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(list) : e18Var.h(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(str2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (!e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            e18Var.T();
        } else if (str == null) {
            e18Var.a0(-35207165);
            e18Var.p(false);
        } else {
            e18Var.a0(-35207164);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (x44.r(((McpServer) next).m346getUuidowoRr7k(), str)) {
                        break;
                    }
                }
            }
            McpServer mcpServer = (McpServer) next;
            if (mcpServer != null) {
                e18Var.a0(1224024873);
                ssj.a(ssj.s(mcpServer.m346getUuidowoRr7k(), mcpServer.getName(), mcpServer.getUrl(), str2, e18Var, i2 & 7168), zy7Var, zy7Var, e18Var, (i2 & 896) | ((i2 >> 3) & 112));
                e18Var.p(false);
            } else {
                e18Var.a0(1224467894);
                e18Var.p(false);
            }
            e18Var.p(false);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xd(list, str, zy7Var, str2, i, 20);
        }
    }

    public static final long b(long j, l9e l9eVar) {
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = l9eVar.a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = l9eVar.c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = l9eVar.b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = l9eVar.d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public static final long c(akh akhVar, long j) {
        fcc fccVar;
        cu9 cu9VarE = akhVar.e();
        if (cu9VarE != null) {
            cu9 cu9VarB = akhVar.b();
            if (cu9VarB != null) {
                fccVar = new fcc((cu9VarE.n() && cu9VarB.n()) ? cu9VarE.G(cu9VarB, j) : j);
            } else {
                fccVar = null;
            }
            if (fccVar != null) {
                return fccVar.a;
            }
        }
        return j;
    }

    public static hab d(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new hab(str + '#' + str2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|56|3|(4:5|58|6|(8:8|57|23|(4:25|59|26|(4:28|46|(1:(1:61)(2:48|(2:60|50)(1:51)))|(1:53)(2:54|55))(2:35|36))(2:42|43)|45|46|(2:(0)(0)|51)|(0)(0))(2:13|14))(2:19|20)|22|57|23|(0)(0)|45|46|(2:(0)(0)|51)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0079, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0084, code lost:
    
        r1.add(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048 A[Catch: JsonParseException -> 0x0079, TRY_LEAVE, TryCatch #2 {JsonParseException -> 0x0079, blocks: (B:23:0x0044, B:25:0x0048, B:26:0x004c, B:28:0x0052, B:35:0x0065, B:36:0x006c, B:37:0x006d, B:38:0x0071, B:39:0x0075, B:42:0x007c, B:43:0x0083), top: B:57:0x0044, inners: #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c A[Catch: JsonParseException -> 0x0079, TryCatch #2 {JsonParseException -> 0x0079, blocks: (B:23:0x0044, B:25:0x0048, B:26:0x004c, B:28:0x0052, B:35:0x0065, B:36:0x006c, B:37:0x006d, B:38:0x0071, B:39:0x0075, B:42:0x007c, B:43:0x0083), top: B:57:0x0044, inners: #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c A[EDGE_INSN: B:61:0x009c->B:52:0x009c BREAK  A[LOOP:0: B:47:0x0091->B:51:0x0099], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ape e(defpackage.bh9 r7) {
        /*
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            boolean r0 = r7 instanceof defpackage.vh9     // Catch: com.google.gson.JsonParseException -> L36
            if (r0 == 0) goto L38
            r0 = r7
            vh9 r0 = (defpackage.vh9) r0     // Catch: com.google.gson.JsonParseException -> L36
            java.lang.String r3 = "Unable to parse json into type String"
            java.io.Serializable r4 = r0.E     // Catch: java.lang.UnsupportedOperationException -> L22 java.lang.IllegalStateException -> L24 com.google.gson.JsonParseException -> L36
            boolean r4 = r4 instanceof java.lang.String     // Catch: java.lang.UnsupportedOperationException -> L22 java.lang.IllegalStateException -> L24 com.google.gson.JsonParseException -> L36
            if (r4 == 0) goto L26
            zoe r4 = new zoe     // Catch: java.lang.UnsupportedOperationException -> L22 java.lang.IllegalStateException -> L24 com.google.gson.JsonParseException -> L36
            java.lang.String r0 = r0.m()     // Catch: java.lang.UnsupportedOperationException -> L22 java.lang.IllegalStateException -> L24 com.google.gson.JsonParseException -> L36
            r0.getClass()     // Catch: java.lang.UnsupportedOperationException -> L22 java.lang.IllegalStateException -> L24 com.google.gson.JsonParseException -> L36
            r4.<init>(r0)     // Catch: java.lang.UnsupportedOperationException -> L22 java.lang.IllegalStateException -> L24 com.google.gson.JsonParseException -> L36
            goto L44
        L22:
            r0 = move-exception
            goto L2e
        L24:
            r0 = move-exception
            goto L32
        L26:
            com.google.gson.JsonParseException r0 = new com.google.gson.JsonParseException     // Catch: java.lang.UnsupportedOperationException -> L22 java.lang.IllegalStateException -> L24 com.google.gson.JsonParseException -> L36
            java.lang.String r4 = "Can't convert jsonPrimitive to String"
            r0.<init>(r4)     // Catch: java.lang.UnsupportedOperationException -> L22 java.lang.IllegalStateException -> L24 com.google.gson.JsonParseException -> L36
            throw r0     // Catch: java.lang.UnsupportedOperationException -> L22 java.lang.IllegalStateException -> L24 com.google.gson.JsonParseException -> L36
        L2e:
            defpackage.pmf.j(r3, r0)     // Catch: com.google.gson.JsonParseException -> L36
            goto L43
        L32:
            defpackage.pmf.j(r3, r0)     // Catch: com.google.gson.JsonParseException -> L36
            goto L43
        L36:
            r0 = move-exception
            goto L40
        L38:
            com.google.gson.JsonParseException r0 = new com.google.gson.JsonParseException     // Catch: com.google.gson.JsonParseException -> L36
            java.lang.String r3 = "Unable to parse json into type kotlin.String"
            r0.<init>(r3)     // Catch: com.google.gson.JsonParseException -> L36
            throw r0     // Catch: com.google.gson.JsonParseException -> L36
        L40:
            r1.add(r0)
        L43:
            r4 = r2
        L44:
            boolean r0 = r7 instanceof defpackage.vh9     // Catch: com.google.gson.JsonParseException -> L79
            if (r0 == 0) goto L7c
            vh9 r7 = (defpackage.vh9) r7     // Catch: com.google.gson.JsonParseException -> L79
            java.lang.String r3 = "Unable to parse json into type Long"
            java.io.Serializable r0 = r7.E     // Catch: java.lang.UnsupportedOperationException -> L5c java.lang.NumberFormatException -> L5f java.lang.IllegalStateException -> L62 com.google.gson.JsonParseException -> L79
            boolean r0 = r0 instanceof java.lang.Number     // Catch: java.lang.UnsupportedOperationException -> L5c java.lang.NumberFormatException -> L5f java.lang.IllegalStateException -> L62 com.google.gson.JsonParseException -> L79
            if (r0 == 0) goto L65
            yoe r0 = new yoe     // Catch: java.lang.UnsupportedOperationException -> L5c java.lang.NumberFormatException -> L5f java.lang.IllegalStateException -> L62 com.google.gson.JsonParseException -> L79
            long r5 = r7.k()     // Catch: java.lang.UnsupportedOperationException -> L5c java.lang.NumberFormatException -> L5f java.lang.IllegalStateException -> L62 com.google.gson.JsonParseException -> L79
            r0.<init>(r5)     // Catch: java.lang.UnsupportedOperationException -> L5c java.lang.NumberFormatException -> L5f java.lang.IllegalStateException -> L62 com.google.gson.JsonParseException -> L79
            goto L88
        L5c:
            r0 = move-exception
            r7 = r0
            goto L6d
        L5f:
            r0 = move-exception
            r7 = r0
            goto L71
        L62:
            r0 = move-exception
            r7 = r0
            goto L75
        L65:
            com.google.gson.JsonParseException r7 = new com.google.gson.JsonParseException     // Catch: java.lang.UnsupportedOperationException -> L5c java.lang.NumberFormatException -> L5f java.lang.IllegalStateException -> L62 com.google.gson.JsonParseException -> L79
            java.lang.String r0 = "Can't convert jsonPrimitive to Long"
            r7.<init>(r0)     // Catch: java.lang.UnsupportedOperationException -> L5c java.lang.NumberFormatException -> L5f java.lang.IllegalStateException -> L62 com.google.gson.JsonParseException -> L79
            throw r7     // Catch: java.lang.UnsupportedOperationException -> L5c java.lang.NumberFormatException -> L5f java.lang.IllegalStateException -> L62 com.google.gson.JsonParseException -> L79
        L6d:
            defpackage.pmf.j(r3, r7)     // Catch: com.google.gson.JsonParseException -> L79
            goto L87
        L71:
            defpackage.pmf.j(r3, r7)     // Catch: com.google.gson.JsonParseException -> L79
            goto L87
        L75:
            defpackage.pmf.j(r3, r7)     // Catch: com.google.gson.JsonParseException -> L79
            goto L87
        L79:
            r0 = move-exception
            r7 = r0
            goto L84
        L7c:
            com.google.gson.JsonParseException r7 = new com.google.gson.JsonParseException     // Catch: com.google.gson.JsonParseException -> L79
            java.lang.String r0 = "Unable to parse json into type kotlin.Long"
            r7.<init>(r0)     // Catch: com.google.gson.JsonParseException -> L79
            throw r7     // Catch: com.google.gson.JsonParseException -> L79
        L84:
            r1.add(r7)
        L87:
            r0 = r2
        L88:
            r7 = 2
            ape[] r3 = new defpackage.ape[r7]
            r5 = 0
            r3[r5] = r4
            r4 = 1
            r3[r4] = r0
        L91:
            if (r5 >= r7) goto L9c
            r0 = r3[r5]
            if (r0 == 0) goto L99
            r2 = r0
            goto L9c
        L99:
            int r5 = r5 + 1
            goto L91
        L9c:
            if (r2 == 0) goto L9f
            return r2
        L9f:
            p9d r5 = defpackage.p9d.T
            r6 = 30
            java.lang.String r2 = "\n"
            r3 = 0
            r4 = 0
            java.lang.String r7 = defpackage.w44.S0(r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = "Unable to parse json into one of type \nPath\n"
            java.lang.String r7 = r0.concat(r7)
            com.google.gson.JsonParseException r0 = new com.google.gson.JsonParseException
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqk.e(bh9):ape");
    }

    public static hab f(fe5 fe5Var) {
        if (!(fe5Var instanceof ik9)) {
            if (fe5Var instanceof hk9) {
                hk9 hk9Var = (hk9) fe5Var;
                return d(hk9Var.i, hk9Var.j);
            }
            wg6.i();
            return null;
        }
        ik9 ik9Var = (ik9) fe5Var;
        String str = ik9Var.i;
        String str2 = ik9Var.j;
        str.getClass();
        str2.getClass();
        return new hab(str.concat(str2));
    }

    public static hab g(txb txbVar, wk9 wk9Var) {
        txbVar.getClass();
        return new hab(txbVar.getString(wk9Var.G).concat(txbVar.getString(wk9Var.H)));
    }

    public static hab h(hab habVar, int i) {
        return new hab(habVar.a + '@' + i);
    }

    public static final long i(akh akhVar, long j) {
        cu9 cu9VarE = akhVar.e();
        if (cu9VarE != null) {
            fcc fccVar = null;
            if (!cu9VarE.n()) {
                cu9VarE = null;
            }
            if (cu9VarE != null) {
                cu9 cu9Var = (cu9) akhVar.d.getValue();
                if (cu9Var != null) {
                    if (!cu9Var.n()) {
                        cu9Var = null;
                    }
                    if (cu9Var != null) {
                        fccVar = new fcc(cu9Var.G(cu9VarE, j));
                    }
                }
                if (fccVar != null) {
                    return fccVar.a;
                }
            }
        }
        return j;
    }

    public static final l9e j(akh akhVar, l9e l9eVar) {
        cu9 cu9VarB;
        cu9 cu9VarE = akhVar.e();
        if (cu9VarE != null) {
            if (!cu9VarE.n()) {
                cu9VarE = null;
            }
            if (cu9VarE != null && (cu9VarB = akhVar.b()) != null) {
                cu9 cu9Var = cu9VarB.n() ? cu9VarB : null;
                if (cu9Var != null) {
                    return l9eVar.m(cu9Var.J(cu9VarE, false).h());
                }
            }
        }
        return l9eVar;
    }

    public static final long k(akh akhVar, long j) {
        cu9 cu9VarB = akhVar.b();
        return (cu9VarB == null || !cu9VarB.n()) ? j : cu9VarB.w(j);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [v20] */
    public static int[] l(wjh wjhVar, RectF rectF, int i, final fp fpVar) {
        SegmentFinder segmentFinderL;
        if (i == 1) {
            segmentFinderL = new re0(new dke(wjhVar.f.getText(), wjhVar.j()));
        } else {
            ds.n();
            segmentFinderL = ds.l(ds.k(wjhVar.f.getText(), wjhVar.a));
        }
        return wjhVar.f.getRangeForRect(rectF, segmentFinderL, new Layout.TextInclusionStrategy() { // from class: v20
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) fpVar.invoke(rectF2, rectF3)).booleanValue();
            }
        });
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public static java.util.regex.Pattern m(java.lang.String r5) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 64
            r0.<init>(r1)
            r1 = 94
            r0.append(r1)
            r1 = 0
        Ld:
            int r2 = r5.length()
            r3 = 36
            if (r1 >= r2) goto L45
            char r2 = r5.charAt(r1)
            if (r2 == r3) goto L3a
            r3 = 46
            if (r2 == r3) goto L3a
            r4 = 63
            if (r2 == r4) goto L36
            switch(r2) {
                case 40: goto L3a;
                case 41: goto L3a;
                case 42: goto L30;
                default: goto L26;
            }
        L26:
            switch(r2) {
                case 91: goto L3a;
                case 92: goto L3a;
                case 93: goto L3a;
                case 94: goto L3a;
                default: goto L29;
            }
        L29:
            switch(r2) {
                case 123: goto L3a;
                case 124: goto L3a;
                case 125: goto L3a;
                default: goto L2c;
            }
        L2c:
            r0.append(r2)
            goto L42
        L30:
            java.lang.String r2 = ".*"
            r0.append(r2)
            goto L42
        L36:
            r0.append(r3)
            goto L42
        L3a:
            java.lang.String r3 = "\\"
            r0.append(r3)
            r0.append(r2)
        L42:
            int r1 = r1 + 1
            goto Ld
        L45:
            r0.append(r3)
            java.lang.String r5 = r0.toString()
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqk.m(java.lang.String):java.util.regex.Pattern");
    }

    public static int n(byte[] bArr, int i, po0 po0Var) {
        int iV = v(bArr, i, po0Var);
        int i2 = po0Var.a;
        if (i2 < 0) {
            poc.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - iV) {
            poc.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            po0Var.c = w9k.F;
            return iV;
        }
        po0Var.c = w9k.o(bArr, iV, i2);
        return iV + i2;
    }

    public static int o(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int p(klk klkVar, byte[] bArr, int i, int i2, int i3, po0 po0Var) {
        zdk zdkVarA = klkVar.a();
        int iZ = z(zdkVarA, klkVar, bArr, i, i2, i3, po0Var);
        klkVar.b(zdkVarA);
        po0Var.c = zdkVarA;
        return iZ;
    }

    public static int q(klk klkVar, byte[] bArr, int i, int i2, po0 po0Var) {
        zdk zdkVarA = klkVar.a();
        int iA = A(zdkVarA, klkVar, bArr, i, i2, po0Var);
        klkVar.b(zdkVarA);
        po0Var.c = zdkVarA;
        return iA;
    }

    public static int r(klk klkVar, int i, byte[] bArr, int i2, int i3, xek xekVar, po0 po0Var) {
        int iQ = q(klkVar, bArr, i2, i3, po0Var);
        xekVar.add(po0Var.c);
        while (iQ < i3) {
            int iV = v(bArr, iQ, po0Var);
            if (i != po0Var.a) {
                break;
            }
            iQ = q(klkVar, bArr, iV, i3, po0Var);
            xekVar.add(po0Var.c);
        }
        return iQ;
    }

    public static int s(byte[] bArr, int i, xek xekVar, po0 po0Var) {
        dek dekVar = (dek) xekVar;
        int iV = v(bArr, i, po0Var);
        int i2 = po0Var.a + iV;
        while (iV < i2) {
            iV = v(bArr, iV, po0Var);
            dekVar.h(po0Var.a);
        }
        if (iV == i2) {
            return iV;
        }
        poc.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int t(byte[] bArr, int i, po0 po0Var) {
        int iV = v(bArr, i, po0Var);
        int i2 = po0Var.a;
        if (i2 < 0) {
            poc.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 == 0) {
            po0Var.c = "";
            return iV;
        }
        int i3 = d.a;
        int length = bArr.length;
        if ((((length - iV) - i2) | iV | i2) < 0) {
            pmf.k("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(iV), Integer.valueOf(i2)});
            return 0;
        }
        int i4 = iV + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (iV < i4) {
            byte b = bArr[iV];
            if (b < 0) {
                break;
            }
            iV++;
            cArr[i5] = (char) b;
            i5++;
        }
        while (iV < i4) {
            int i6 = iV + 1;
            byte b2 = bArr[iV];
            if (b2 >= 0) {
                cArr[i5] = (char) b2;
                i5++;
                iV = i6;
                while (iV < i4) {
                    byte b3 = bArr[iV];
                    if (b3 >= 0) {
                        iV++;
                        cArr[i5] = (char) b3;
                        i5++;
                    }
                }
            } else {
                if (b2 >= -32) {
                    if (b2 >= -16) {
                        if (i6 >= i4 - 2) {
                            poc.s("Protocol message had invalid UTF-8.");
                            return 0;
                        }
                        byte b4 = bArr[i6];
                        int i7 = iV + 3;
                        byte b5 = bArr[iV + 2];
                        iV += 4;
                        byte b6 = bArr[i7];
                        if (!yrk.p(b4)) {
                            if ((((b4 + 112) + (b2 << 28)) >> 30) == 0 && !yrk.p(b5) && !yrk.p(b6)) {
                                int i8 = ((b4 & 63) << 12) | ((b2 & 7) << 18) | ((b5 & 63) << 6) | (b6 & 63);
                                cArr[i5] = (char) ((i8 >>> 10) + 55232);
                                cArr[i5 + 1] = (char) ((i8 & 1023) + 56320);
                                i5 += 2;
                            }
                        }
                        poc.s("Protocol message had invalid UTF-8.");
                        return 0;
                    }
                    if (i6 >= i4 - 1) {
                        poc.s("Protocol message had invalid UTF-8.");
                        return 0;
                    }
                    int i9 = i5 + 1;
                    int i10 = iV + 2;
                    byte b7 = bArr[i6];
                    iV += 3;
                    byte b8 = bArr[i10];
                    if (!yrk.p(b7)) {
                        if (b2 == -32) {
                            if (b7 >= -96) {
                                b2 = -32;
                            }
                        }
                        if (b2 == -19) {
                            if (b7 < -96) {
                                b2 = -19;
                            }
                        }
                        if (!yrk.p(b8)) {
                            cArr[i5] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
                            i5 = i9;
                        }
                    }
                    poc.s("Protocol message had invalid UTF-8.");
                    return 0;
                }
                if (i6 >= i4) {
                    poc.s("Protocol message had invalid UTF-8.");
                    return 0;
                }
                int i11 = i5 + 1;
                iV += 2;
                byte b9 = bArr[i6];
                if (b2 < -62 || yrk.p(b9)) {
                    poc.s("Protocol message had invalid UTF-8.");
                    return 0;
                }
                cArr[i5] = (char) ((b9 & 63) | ((b2 & 31) << 6));
                i5 = i11;
            }
        }
        po0Var.c = new String(cArr, 0, i5);
        return i4;
    }

    public static int u(int i, byte[] bArr, int i2, int i3, vnk vnkVar, po0 po0Var) {
        if ((i >>> 3) == 0) {
            poc.s("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iY = y(bArr, i2, po0Var);
            vnkVar.c(i, Long.valueOf(po0Var.b));
            return iY;
        }
        if (i4 == 1) {
            vnkVar.c(i, Long.valueOf(B(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iV = v(bArr, i2, po0Var);
            int i5 = po0Var.a;
            if (i5 < 0) {
                poc.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - iV) {
                poc.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                vnkVar.c(i, w9k.F);
            } else {
                vnkVar.c(i, w9k.o(bArr, iV, i5));
            }
            return iV + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                vnkVar.c(i, Integer.valueOf(o(bArr, i2)));
                return i2 + 4;
            }
            poc.s("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        vnk vnkVarB = vnk.b();
        int i7 = po0Var.d + 1;
        po0Var.d = i7;
        if (i7 >= 100) {
            poc.s("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iV2 = v(bArr, i2, po0Var);
            int i9 = po0Var.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iV2;
                break;
            }
            i2 = u(i9, bArr, iV2, i3, vnkVarB, po0Var);
            i8 = i9;
        }
        po0Var.d--;
        if (i2 > i3 || i8 != i6) {
            poc.s("Failed to parse the message.");
            return 0;
        }
        vnkVar.c(i, vnkVarB);
        return i2;
    }

    public static int v(byte[] bArr, int i, po0 po0Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return w(b, bArr, i2, po0Var);
        }
        po0Var.a = b;
        return i2;
    }

    public static int w(int i, byte[] bArr, int i2, po0 po0Var) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            po0Var.a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            po0Var.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            po0Var.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            po0Var.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                po0Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int x(int i, byte[] bArr, int i2, int i3, xek xekVar, po0 po0Var) {
        dek dekVar = (dek) xekVar;
        int iV = v(bArr, i2, po0Var);
        dekVar.h(po0Var.a);
        while (iV < i3) {
            int iV2 = v(bArr, iV, po0Var);
            if (i != po0Var.a) {
                break;
            }
            iV = v(bArr, iV2, po0Var);
            dekVar.h(po0Var.a);
        }
        return iV;
    }

    public static int y(byte[] bArr, int i, po0 po0Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            po0Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        po0Var.b = j2;
        return i3;
    }

    public static int z(Object obj, klk klkVar, byte[] bArr, int i, int i2, int i3, po0 po0Var) {
        jkk jkkVar = (jkk) klkVar;
        int i4 = po0Var.d + 1;
        po0Var.d = i4;
        if (i4 >= 100) {
            poc.s("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int iT = jkkVar.t(obj, bArr, i, i2, i3, po0Var);
        po0Var.d--;
        po0Var.c = obj;
        return iT;
    }
}
