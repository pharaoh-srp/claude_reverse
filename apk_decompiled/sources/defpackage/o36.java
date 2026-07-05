package defpackage;

import com.anthropic.claude.code.ui.DiffLineComment;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o36 implements w28 {
    public static final o36 a;
    private static final SerialDescriptor descriptor;

    static {
        o36 o36Var = new o36();
        a = o36Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.code.ui.DiffLineComment", o36Var, 8);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("filePath", false);
        pluginGeneratedSerialDescriptor.j("lineKey", false);
        pluginGeneratedSerialDescriptor.j("oldLineNumber", false);
        pluginGeneratedSerialDescriptor.j("newLineNumber", false);
        pluginGeneratedSerialDescriptor.j("lineContent", false);
        pluginGeneratedSerialDescriptor.j("commentText", false);
        pluginGeneratedSerialDescriptor.j("createdAt", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        e79 e79Var = e79.a;
        KSerializer kSerializerS = d4c.S(e79Var);
        KSerializer kSerializerS2 = d4c.S(e79Var);
        srg srgVar = srg.a;
        xka xkaVar = xka.a;
        return new KSerializer[]{srgVar, srgVar, xkaVar, kSerializerS, kSerializerS2, srgVar, srgVar, xkaVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int i = 0;
        String strV = null;
        String strV2 = null;
        Integer num = null;
        Integer num2 = null;
        String strV3 = null;
        String strV4 = null;
        long j = 0;
        long j2 = 0;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    j = ud4VarC.j(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) ud4VarC.m(serialDescriptor, 3, e79.a, num);
                    i |= 8;
                    break;
                case 4:
                    num2 = (Integer) ud4VarC.m(serialDescriptor, 4, e79.a, num2);
                    i |= 16;
                    break;
                case 5:
                    strV3 = ud4VarC.v(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    strV4 = ud4VarC.v(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    j2 = ud4VarC.j(serialDescriptor, 7);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new DiffLineComment(i, strV, strV2, j, num, num2, strV3, strV4, j2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        DiffLineComment diffLineComment = (DiffLineComment) obj;
        encoder.getClass();
        diffLineComment.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        DiffLineComment.write$Self$ui(diffLineComment, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
