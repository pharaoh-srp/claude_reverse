package com.anthropic.claude.code.remote.notification;

import com.anthropic.claude.code.remote.notification.CCRPermissionActionWorker;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;
import com.anthropic.claude.types.strings.SessionId;
import com.anthropic.claude.types.strings.ToolUseId;
import defpackage.c1i;
import defpackage.d4c;
import defpackage.fkc;
import defpackage.fsf;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.w28;
import defpackage.z7;
import defpackage.zt1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements w28 {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.code.remote.notification.CCRPermissionActionWorker.Args", aVar, 7);
        pluginGeneratedSerialDescriptor.j("sessionId", false);
        pluginGeneratedSerialDescriptor.j("requestId", false);
        pluginGeneratedSerialDescriptor.j("toolUseId", false);
        pluginGeneratedSerialDescriptor.j("accountId", false);
        pluginGeneratedSerialDescriptor.j("organizationId", false);
        pluginGeneratedSerialDescriptor.j("allow", false);
        pluginGeneratedSerialDescriptor.j("comment", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{fsf.a, srgVar, c1i.a, z7.a, fkc.a, zt1.a, d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        String strM1120unboximpl = null;
        String strV = null;
        String strM1163unboximpl = null;
        String strM949unboximpl = null;
        String strM1071unboximpl = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    SessionId sessionId = (SessionId) ud4VarC.l(serialDescriptor, 0, fsf.a, strM1120unboximpl != null ? SessionId.m1114boximpl(strM1120unboximpl) : null);
                    strM1120unboximpl = sessionId != null ? sessionId.m1120unboximpl() : null;
                    i |= 1;
                    break;
                case 1:
                    strV = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    ToolUseId toolUseId = (ToolUseId) ud4VarC.l(serialDescriptor, 2, c1i.a, strM1163unboximpl != null ? ToolUseId.m1157boximpl(strM1163unboximpl) : null);
                    strM1163unboximpl = toolUseId != null ? toolUseId.m1163unboximpl() : null;
                    i |= 4;
                    break;
                case 3:
                    AccountId accountId = (AccountId) ud4VarC.l(serialDescriptor, 3, z7.a, strM949unboximpl != null ? AccountId.m943boximpl(strM949unboximpl) : null);
                    strM949unboximpl = accountId != null ? accountId.m949unboximpl() : null;
                    i |= 8;
                    break;
                case 4:
                    OrganizationId organizationId = (OrganizationId) ud4VarC.l(serialDescriptor, 4, fkc.a, strM1071unboximpl != null ? OrganizationId.m1065boximpl(strM1071unboximpl) : null);
                    strM1071unboximpl = organizationId != null ? organizationId.m1071unboximpl() : null;
                    i |= 16;
                    break;
                case 5:
                    zU = ud4VarC.u(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CCRPermissionActionWorker.Args(i, strM1120unboximpl, strV, strM1163unboximpl, strM949unboximpl, strM1071unboximpl, zU, str, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CCRPermissionActionWorker.Args args = (CCRPermissionActionWorker.Args) obj;
        encoder.getClass();
        args.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CCRPermissionActionWorker.Args.write$Self$remote(args, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
