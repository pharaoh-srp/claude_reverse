package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.location.Location;
import android.net.Uri;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.chat.MessageAttachment;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.bell.VoiceSessionSummary;
import com.anthropic.claude.chat.input.draft.DraftMessage;
import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.conway.f;
import com.anthropic.claude.login.MagicLinkIntentData;
import com.anthropic.claude.types.strings.SessionId;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class u73 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u73(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                return new u73((qi3) this.F, (VoiceSessionSummary) obj2, tp4Var, 0);
            case 1:
                return new u73((f93) this.F, (List) obj2, tp4Var, 1);
            case 2:
                return new u73((MessageAttachment) this.F, (rwe) obj2, tp4Var, 2);
            case 3:
                return new u73((v77) this.F, (String) obj2, tp4Var, 3);
            case 4:
                u73 u73Var = new u73((c) obj2, tp4Var, 4);
                u73Var.F = ((SessionId) obj).m1120unboximpl();
                return u73Var;
            case 5:
                return new u73((i) this.F, (kpf) obj2, tp4Var, 5);
            case 6:
                return new u73((i) this.F, (bt7) obj2, tp4Var, 6);
            case 7:
                return new u73((i) this.F, (wlg) obj2, tp4Var, 7);
            case 8:
                return new u73((McpServer) this.F, (nwb) obj2, tp4Var, 8);
            case 9:
                return new u73((List) this.F, (zy7) obj2, tp4Var, 9);
            case 10:
                return new u73((Context) this.F, (Location) obj2, tp4Var, 10);
            case 11:
                return new u73((zy7) this.F, (wlg) obj2, tp4Var, 11);
            case 12:
                return new u73((List) this.F, (ContentResolver) obj2, tp4Var, 12);
            case 13:
                return new u73((Context) this.F, (Uri) obj2, tp4Var, 13);
            case 14:
                return new u73((f) this.F, (Uri) obj2, tp4Var, 14);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new u73((nwb) this.F, (nwb) obj2, tp4Var, 15);
            case 16:
                return new u73((AtomicReference) this.F, (c61) obj2, tp4Var, 16);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new u73((List) this.F, (bz7) obj2, tp4Var, 17);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new u73((DraftMessage) this.F, (fb6) obj2, tp4Var, 18);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new u73((nn6) this.F, (Context) obj2, tp4Var, 19);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                u73 u73Var2 = new u73((rp6) obj2, tp4Var, 20);
                u73Var2.F = obj;
                return u73Var2;
            case 21:
                u73 u73Var3 = new u73((Set) obj2, tp4Var, 21);
                u73Var3.F = obj;
                return u73Var3;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                u73 u73Var4 = new u73((String) obj2, tp4Var, 22);
                u73Var4.F = obj;
                return u73Var4;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                u73 u73Var5 = new u73((bu9) obj2, tp4Var, 23);
                u73Var5.F = obj;
                return u73Var5;
            case 24:
                u73 u73Var6 = new u73((d4a) obj2, tp4Var, 24);
                u73Var6.F = obj;
                return u73Var6;
            case BuildConfig.VERSION_CODE /* 25 */:
                return new u73((bpa) this.F, (MagicLinkIntentData) obj2, tp4Var, 25);
            case 26:
                return new u73((lvh) this.F, (String) obj2, tp4Var, 26);
            case 27:
                return new u73((wxc) this.F, (nwb) obj2, tp4Var, 27);
            case 28:
                return new u73((tec) this.F, (zy7) obj2, tp4Var, 28);
            default:
                return new u73((Set) this.F, (q1d) obj2, tp4Var, 29);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((u73) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 1:
                return ((u73) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 2:
                ((u73) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 3:
                ((u73) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 4:
                ((u73) create(SessionId.m1114boximpl(((SessionId) obj).m1120unboximpl()), (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 5:
                ((u73) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 6:
                ((u73) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 7:
                ((u73) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 8:
                ((u73) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 9:
                ((u73) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 10:
                return ((u73) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 11:
                ((u73) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 12:
                return ((u73) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 13:
                return ((u73) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 14:
                ((u73) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((u73) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 16:
                ((u73) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((u73) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                return ((u73) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((u73) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((u73) create((cjh) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 21:
                return ((u73) create((yvb) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((u73) create((yvb) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ((u73) create((tv9) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 24:
                ((u73) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case BuildConfig.VERSION_CODE /* 25 */:
                ((u73) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 26:
                ((u73) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 27:
                ((u73) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 28:
                ((u73) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            default:
                return ((u73) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0783  */
    /* JADX WARN: Type inference failed for: r8v0, types: [nf0] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v19 */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2168
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u73.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u73(Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
    }
}
