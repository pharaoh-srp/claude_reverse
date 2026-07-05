package defpackage;

import com.anthropic.claude.api.tasks.McpToolUseEvent;
import com.anthropic.claude.api.tasks.TaskStepResponse;
import com.anthropic.claude.types.strings.TaskId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w8h {
    public static final float a = (12.0f + 4.0f) + 4.0f;

    /* JADX WARN: Removed duplicated region for block: B:120:0x0200 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.b9h r29, defpackage.iqb r30, defpackage.ld4 r31, int r32) {
        /*
            Method dump skipped, instruction units count: 1146
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w8h.a(b9h, iqb, ld4, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.util.List r19, defpackage.c9h r20, defpackage.iqb r21, defpackage.qnc r22, defpackage.ld4 r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w8h.b(java.util.List, c9h, iqb, qnc, ld4, int, int):void");
    }

    public static final void c(String str, TaskStepResponse taskStepResponse, iqb iqbVar, qnc qncVar, e9h e9hVar, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        e9h e9hVar2;
        int i2;
        iqb iqbVar3;
        e9h e9hVar3;
        e9h e9hVar4;
        str.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1255893192);
        int i3 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.f(taskStepResponse) ? 32 : 16) | 384 | (e18Var2.f(qncVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        if (e18Var2.Q(i3 & 1, (i3 & 9363) != 9362)) {
            e18Var2.V();
            int i4 = i & 1;
            lz1 lz1Var = jd4.a;
            tp4 tp4Var = null;
            if (i4 == 0 || e18Var2.A()) {
                String uuid = taskStepResponse.getUuid();
                uuid.getClass();
                m7f m7fVar = (m7f) e18Var2.j(gr9.b);
                boolean zF = e18Var2.f(uuid) | ((((i3 & 14) ^ 6) > 4 && e18Var2.f(str)) || (i3 & 6) == 4);
                Object objN = e18Var2.N();
                if (zF || objN == lz1Var) {
                    objN = (e9h) m7fVar.a(jce.a.b(e9h.class), null, null);
                    e18Var2.k0(objN);
                }
                i2 = i3 & (-57345);
                iqbVar3 = fqb.E;
                e9hVar3 = (e9h) objN;
            } else {
                e18Var2.T();
                i2 = i3 & (-57345);
                iqbVar3 = iqbVar;
                e9hVar3 = e9hVar;
            }
            int i5 = i2;
            e18Var2.q();
            TaskId taskIdM1128boximpl = TaskId.m1128boximpl(str);
            String uuid2 = taskStepResponse.getUuid();
            boolean zH = e18Var2.h(e9hVar3) | ((i5 & 14) == 4) | ((i5 & 112) == 32);
            Object objN2 = e18Var2.N();
            if (zH || objN2 == lz1Var) {
                v2h v2hVar = new v2h(e9hVar3, str, taskStepResponse, tp4Var, 4);
                e9hVar4 = e9hVar3;
                e18Var2.k0(v2hVar);
                objN2 = v2hVar;
            } else {
                e9hVar4 = e9hVar3;
            }
            fd9.j(taskIdM1128boximpl, uuid2, (pz7) objN2, e18Var2);
            e18Var = e18Var2;
            iqb iqbVar4 = iqbVar3;
            b(e9hVar4.b, (c9h) e9hVar4.c.getValue(), iqbVar4, qncVar, e18Var, i5 & 8064, 0);
            iqbVar2 = iqbVar4;
            e9hVar2 = e9hVar4;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
            e9hVar2 = e9hVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new w4d(str, taskStepResponse, iqbVar2, qncVar, e9hVar2, i, 7);
        }
    }

    public static final String d(s7h s7hVar) {
        String string = bsg.k1(isg.o0(s7hVar.getTool_name(), '_', ' ')).toString();
        if (string.length() > 0) {
            StringBuilder sb = new StringBuilder();
            String strValueOf = String.valueOf(string.charAt(0));
            strValueOf.getClass();
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            sb.append((Object) upperCase);
            sb.append(string.substring(1));
            string = sb.toString();
        }
        return s7hVar instanceof McpToolUseEvent ? ij0.C(((McpToolUseEvent) s7hVar).getMcp_server_name(), " · ", string) : string;
    }
}
