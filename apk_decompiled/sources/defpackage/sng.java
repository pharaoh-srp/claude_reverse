package defpackage;

import com.anthropic.claude.models.StickyModelSelection;
import com.anthropic.claude.types.strings.ModelId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sng implements w28 {
    public static final sng a;
    private static final SerialDescriptor descriptor;

    static {
        sng sngVar = new sng();
        a = sngVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.StickyModelSelection", sngVar, 3);
        pluginGeneratedSerialDescriptor.j("modelId", false);
        pluginGeneratedSerialDescriptor.j("isOverflow", false);
        pluginGeneratedSerialDescriptor.j("selectionTimestampMillis", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{vnb.a, d4c.S(zt1.a), xka.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int i = 0;
        String strM1064unboximpl = null;
        Boolean bool = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                ModelId modelId = (ModelId) ud4VarC.l(serialDescriptor, 0, vnb.a, strM1064unboximpl != null ? ModelId.m1058boximpl(strM1064unboximpl) : null);
                strM1064unboximpl = modelId != null ? modelId.m1064unboximpl() : null;
                i |= 1;
            } else if (iX == 1) {
                bool = (Boolean) ud4VarC.m(serialDescriptor, 1, zt1.a, bool);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                j = ud4VarC.j(serialDescriptor, 2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new StickyModelSelection(i, strM1064unboximpl, bool, j, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        StickyModelSelection stickyModelSelection = (StickyModelSelection) obj;
        encoder.getClass();
        stickyModelSelection.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        StickyModelSelection.write$Self$models(stickyModelSelection, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
