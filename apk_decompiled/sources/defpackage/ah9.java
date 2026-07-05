package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class ah9 extends xn5 {
    public final y1 f;
    public final fof g;

    public ah9(y1 y1Var, bg9 bg9Var) {
        bg9Var.getClass();
        this.f = y1Var;
        this.g = bg9Var.b;
    }

    @Override // defpackage.xn5, kotlinx.serialization.encoding.Decoder
    public final byte A() {
        eci eciVar;
        y1 y1Var = this.f;
        String strL = y1Var.l();
        try {
            strL.getClass();
            lci lciVarF0 = wd6.F0(10, strL);
            if (lciVarF0 != null) {
                int i = lciVarF0.E;
                eciVar = Integer.compareUnsigned(i, 255) > 0 ? null : new eci((byte) i);
            }
            if (eciVar != null) {
                return eciVar.E;
            }
            isg.k0(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            y1.q(y1Var, grc.n('\'', "Failed to parse type 'UByte' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.xn5, kotlinx.serialization.encoding.Decoder
    public final short B() {
        vci vciVar;
        y1 y1Var = this.f;
        String strL = y1Var.l();
        try {
            strL.getClass();
            lci lciVarF0 = wd6.F0(10, strL);
            if (lciVarF0 != null) {
                int i = lciVarF0.E;
                vciVar = Integer.compareUnsigned(i, 65535) > 0 ? null : new vci((short) i);
            }
            if (vciVar != null) {
                return vciVar.E;
            }
            isg.k0(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            y1.q(y1Var, grc.n('\'', "Failed to parse type 'UShort' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder, defpackage.ud4
    public final fof a() {
        return this.g;
    }

    @Override // defpackage.xn5, kotlinx.serialization.encoding.Decoder
    public final int p() {
        y1 y1Var = this.f;
        String strL = y1Var.l();
        try {
            strL.getClass();
            lci lciVarF0 = wd6.F0(10, strL);
            if (lciVarF0 != null) {
                return lciVarF0.E;
            }
            isg.k0(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            y1.q(y1Var, grc.n('\'', "Failed to parse type 'UInt' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.xn5, kotlinx.serialization.encoding.Decoder
    public final long t() {
        y1 y1Var = this.f;
        String strL = y1Var.l();
        try {
            strL.getClass();
            qci qciVarG0 = wd6.G0(10, strL);
            if (qciVarG0 != null) {
                return qciVarG0.E;
            }
            isg.k0(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            y1.q(y1Var, grc.n('\'', "Failed to parse type 'ULong' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.ud4
    public final int x(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        throw new IllegalStateException("unsupported");
    }
}
