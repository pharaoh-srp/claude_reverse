package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes.dex */
public final class aj9 {
    public final y1 a;
    public final boolean b;
    public int c;

    public aj9(rg9 rg9Var, y1 y1Var) {
        this.a = y1Var;
        this.b = rg9Var.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.aj9 r10, defpackage.bp5 r11, defpackage.vd1 r12) {
        /*
            y1 r0 = r10.a
            boolean r1 = r12 instanceof defpackage.zi9
            if (r1 == 0) goto L15
            r1 = r12
            zi9 r1 = (defpackage.zi9) r1
            int r2 = r1.L
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.L = r2
            goto L1a
        L15:
            zi9 r1 = new zi9
            r1.<init>(r10, r12)
        L1a:
            java.lang.Object r12 = r1.J
            int r2 = r1.L
            r3 = 0
            r4 = 6
            r5 = 0
            r6 = 7
            r7 = 4
            r8 = 1
            if (r2 == 0) goto L56
            if (r2 != r8) goto L50
            int r10 = r1.I
            java.lang.String r11 = r1.H
            java.util.LinkedHashMap r0 = r1.G
            aj9 r2 = r1.F
            bp5 r9 = r1.E
            defpackage.sf5.h0(r12)
            kotlinx.serialization.json.JsonElement r12 = (kotlinx.serialization.json.JsonElement) r12
            r0.put(r11, r12)
            y1 r11 = r2.a
            byte r11 = r11.f()
            if (r11 == r7) goto L4d
            if (r11 != r6) goto L45
            goto L96
        L45:
            y1 r10 = r2.a
            java.lang.String r11 = "Expected end of the object or comma"
            defpackage.y1.q(r10, r11, r5, r3, r4)
            throw r3
        L4d:
            r5 = r10
            r10 = r2
            goto L6a
        L50:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r10)
            return r3
        L56:
            defpackage.sf5.h0(r12)
            byte r12 = r0.g(r4)
            byte r2 = r0.v()
            if (r2 == r7) goto Lac
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r9 = r11
            r11 = r12
        L6a:
            y1 r12 = r10.a
            boolean r2 = r12.c()
            if (r2 == 0) goto L95
            boolean r11 = r10.b
            if (r11 == 0) goto L7b
            java.lang.String r11 = r12.l()
            goto L7f
        L7b:
            java.lang.String r11 = r12.j()
        L7f:
            r2 = 5
            r12.g(r2)
            r1.E = r9
            r1.F = r10
            r1.G = r0
            r1.H = r11
            r1.I = r5
            r1.L = r8
            r9.a(r1)
            m45 r10 = defpackage.m45.E
            return r10
        L95:
            r2 = r10
        L96:
            y1 r10 = r2.a
            if (r11 != r4) goto L9e
            r10.g(r6)
            goto La0
        L9e:
            if (r11 == r7) goto La6
        La0:
            kotlinx.serialization.json.JsonObject r10 = new kotlinx.serialization.json.JsonObject
            r10.<init>(r0)
            return r10
        La6:
            java.lang.String r11 = "object"
            defpackage.j8.R(r10, r11)
            throw r3
        Lac:
            java.lang.String r10 = "Unexpected leading comma"
            defpackage.y1.q(r0, r10, r5, r3, r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aj9.a(aj9, bp5, vd1):java.lang.Object");
    }

    public final JsonElement b() {
        JsonElement jsonObject;
        y1 y1Var = this.a;
        byte bV = y1Var.v();
        if (bV == 1) {
            return d(true);
        }
        if (bV == 0) {
            return d(false);
        }
        if (bV != 6) {
            if (bV == 8) {
                return c();
            }
            y1.q(y1Var, "Cannot read Json element because of unexpected ".concat(oq5.T(bV)), 0, null, 6);
            throw null;
        }
        int i = this.c + 1;
        this.c = i;
        if (i == 200) {
            jsonObject = (JsonElement) jwk.A(new poj(new yi9(this, null)));
        } else {
            byte bG = y1Var.g((byte) 6);
            if (y1Var.v() == 4) {
                y1.q(y1Var, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!y1Var.c()) {
                    break;
                }
                String strL = this.b ? y1Var.l() : y1Var.j();
                y1Var.g((byte) 5);
                linkedHashMap.put(strL, b());
                bG = y1Var.f();
                if (bG != 4) {
                    if (bG != 7) {
                        y1.q(y1Var, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (bG == 6) {
                y1Var.g((byte) 7);
            } else if (bG == 4) {
                j8.R(y1Var, "object");
                throw null;
            }
            jsonObject = new JsonObject(linkedHashMap);
        }
        this.c--;
        return jsonObject;
    }

    public final JsonArray c() {
        y1 y1Var = this.a;
        byte bF = y1Var.f();
        if (y1Var.v() == 4) {
            y1.q(y1Var, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (y1Var.c()) {
            arrayList.add(b());
            bF = y1Var.f();
            if (bF != 4) {
                boolean z = bF == 9;
                int i = y1Var.b;
                if (!z) {
                    y1.q(y1Var, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bF == 8) {
            y1Var.g((byte) 9);
        } else if (bF == 4) {
            j8.R(y1Var, "array");
            throw null;
        }
        return new JsonArray(arrayList);
    }

    public final JsonPrimitive d(boolean z) {
        boolean z2 = this.b;
        y1 y1Var = this.a;
        String strL = (z2 || !z) ? y1Var.l() : y1Var.j();
        return (z || !x44.r(strL, "null")) ? new jh9(strL, z, null) : JsonNull.INSTANCE;
    }
}
