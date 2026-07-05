package com.anthropic.claude.code.remote;

import com.anthropic.claude.code.remote.CodeSessionListScope;
import com.anthropic.claude.types.strings.SessionGroupingId;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import defpackage.xrf;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements w28 {
    public static final l a;
    private static final SerialDescriptor descriptor;

    static {
        l lVar = new l();
        a = lVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.code.remote.CodeSessionListScope.Project", lVar, 1);
        pluginGeneratedSerialDescriptor.j("id", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{xrf.a};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = true;
        int i = 0;
        String strM1113unboximpl = null;
        while (objArr2 != false) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                objArr2 = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                SessionGroupingId sessionGroupingId = (SessionGroupingId) ud4VarC.l(serialDescriptor, 0, xrf.a, strM1113unboximpl != null ? SessionGroupingId.m1107boximpl(strM1113unboximpl) : null);
                strM1113unboximpl = sessionGroupingId != null ? sessionGroupingId.m1113unboximpl() : null;
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CodeSessionListScope.Project(i, strM1113unboximpl, vnfVar, objArr == true ? 1 : 0);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeSessionListScope.Project project = (CodeSessionListScope.Project) obj;
        encoder.getClass();
        project.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, xrf.a, SessionGroupingId.m1107boximpl(project.id));
        vd4VarC.b(serialDescriptor);
    }
}
