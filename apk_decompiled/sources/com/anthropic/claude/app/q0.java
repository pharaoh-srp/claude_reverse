package com.anthropic.claude.app;

import com.anthropic.claude.app.ClaudeAppOverlay;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.ProjectId;
import com.anthropic.claude.types.strings.ThinkingEffort;
import com.anthropic.claude.types.strings.ThinkingMode;
import defpackage.d4c;
import defpackage.emd;
import defpackage.emh;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnb;
import defpackage.vs2;
import defpackage.w28;
import defpackage.zlh;
import defpackage.zt1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q0 implements w28 {
    public static final q0 a;
    private static final SerialDescriptor descriptor;

    static {
        q0 q0Var = new q0();
        a = q0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.app.ClaudeAppOverlay.BellMode", q0Var, 6);
        pluginGeneratedSerialDescriptor.j("chatId", false);
        pluginGeneratedSerialDescriptor.j("projectId", false);
        pluginGeneratedSerialDescriptor.j("modelId", false);
        pluginGeneratedSerialDescriptor.j("isTemporary", false);
        pluginGeneratedSerialDescriptor.j("effort", true);
        pluginGeneratedSerialDescriptor.j("thinkingMode", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{vs2.a, d4c.S(emd.a), d4c.S(vnb.a), zt1.a, d4c.S(zlh.a), d4c.S(emh.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        String strM984unboximpl = null;
        String strM1085unboximpl = null;
        String strM1064unboximpl = null;
        String strM1141unboximpl = null;
        String strM1149unboximpl = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    ChatId chatId = (ChatId) ud4VarC.l(serialDescriptor, 0, vs2.a, strM984unboximpl != null ? ChatId.m978boximpl(strM984unboximpl) : null);
                    strM984unboximpl = chatId != null ? chatId.m984unboximpl() : null;
                    i |= 1;
                    break;
                case 1:
                    ProjectId projectId = (ProjectId) ud4VarC.m(serialDescriptor, 1, emd.a, strM1085unboximpl != null ? ProjectId.m1079boximpl(strM1085unboximpl) : null);
                    strM1085unboximpl = projectId != null ? projectId.m1085unboximpl() : null;
                    i |= 2;
                    break;
                case 2:
                    ModelId modelId = (ModelId) ud4VarC.m(serialDescriptor, 2, vnb.a, strM1064unboximpl != null ? ModelId.m1058boximpl(strM1064unboximpl) : null);
                    strM1064unboximpl = modelId != null ? modelId.m1064unboximpl() : null;
                    i |= 4;
                    break;
                case 3:
                    zU = ud4VarC.u(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    ThinkingEffort thinkingEffort = (ThinkingEffort) ud4VarC.m(serialDescriptor, 4, zlh.a, strM1141unboximpl != null ? ThinkingEffort.m1135boximpl(strM1141unboximpl) : null);
                    strM1141unboximpl = thinkingEffort != null ? thinkingEffort.m1141unboximpl() : null;
                    i |= 16;
                    break;
                case 5:
                    ThinkingMode thinkingMode = (ThinkingMode) ud4VarC.m(serialDescriptor, 5, emh.a, strM1149unboximpl != null ? ThinkingMode.m1142boximpl(strM1149unboximpl) : null);
                    strM1149unboximpl = thinkingMode != null ? thinkingMode.m1149unboximpl() : null;
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ClaudeAppOverlay.BellMode(i, strM984unboximpl, strM1085unboximpl, strM1064unboximpl, zU, strM1141unboximpl, strM1149unboximpl, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ClaudeAppOverlay.BellMode bellMode = (ClaudeAppOverlay.BellMode) obj;
        encoder.getClass();
        bellMode.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ClaudeAppOverlay.BellMode.write$Self$app(bellMode, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
