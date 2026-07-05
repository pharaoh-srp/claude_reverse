package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class n2d implements Externalizable {
    public boolean D0;
    public boolean E;
    public boolean G;
    public boolean I;
    public boolean K;
    public boolean M;
    public boolean O;
    public boolean Q;
    public boolean S;
    public boolean U;
    public boolean W;
    public boolean Y;
    public boolean a0;
    public boolean c0;
    public boolean e0;
    public boolean g0;
    public boolean i0;
    public boolean k0;
    public boolean p0;
    public boolean r0;
    public boolean t0;
    public boolean v0;
    public boolean x0;
    public o2d F = null;
    public o2d H = null;
    public o2d J = null;
    public o2d L = null;
    public o2d N = null;
    public o2d P = null;
    public o2d R = null;
    public o2d T = null;
    public o2d V = null;
    public o2d X = null;
    public o2d Z = null;
    public o2d b0 = null;
    public o2d d0 = null;
    public o2d f0 = null;
    public o2d h0 = null;
    public o2d j0 = null;
    public o2d l0 = null;
    public String m0 = "";
    public int n0 = 0;
    public String o0 = "";
    public String q0 = "";
    public String s0 = "";
    public String u0 = "";
    public String w0 = "";
    public String y0 = "";
    public boolean z0 = false;
    public final ArrayList A0 = new ArrayList();
    public final ArrayList B0 = new ArrayList();
    public boolean C0 = false;
    public String E0 = "";
    public boolean F0 = false;

    public final int a() {
        return this.n0;
    }

    public final o2d b() {
        return this.H;
    }

    public final o2d c() {
        return this.F;
    }

    public final String d() {
        return this.o0;
    }

    public final ArrayList e() {
        return this.B0;
    }

    public final String f() {
        return this.E0;
    }

    public final o2d g() {
        return this.J;
    }

    public final String h() {
        return this.w0;
    }

    public final String i() {
        return this.y0;
    }

    public final ArrayList j() {
        return this.A0;
    }

    public final o2d k() {
        return this.V;
    }

    public final o2d l() {
        return this.R;
    }

    public final String m() {
        return this.u0;
    }

    public final o2d n() {
        return this.N;
    }

    public final boolean o() {
        return this.z0;
    }

    public final o2d p() {
        return this.P;
    }

    public final o2d q() {
        return this.L;
    }

    public final o2d r() {
        return this.X;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            o2d o2dVar = new o2d();
            o2dVar.readExternal(objectInput);
            this.E = true;
            this.F = o2dVar;
        }
        if (objectInput.readBoolean()) {
            o2d o2dVar2 = new o2d();
            o2dVar2.readExternal(objectInput);
            this.G = true;
            this.H = o2dVar2;
        }
        if (objectInput.readBoolean()) {
            o2d o2dVar3 = new o2d();
            o2dVar3.readExternal(objectInput);
            this.I = true;
            this.J = o2dVar3;
        }
        if (objectInput.readBoolean()) {
            o2d o2dVar4 = new o2d();
            o2dVar4.readExternal(objectInput);
            this.K = true;
            this.L = o2dVar4;
        }
        if (objectInput.readBoolean()) {
            o2d o2dVar5 = new o2d();
            o2dVar5.readExternal(objectInput);
            this.M = true;
            this.N = o2dVar5;
        }
        if (objectInput.readBoolean()) {
            o2d o2dVar6 = new o2d();
            o2dVar6.readExternal(objectInput);
            this.O = true;
            this.P = o2dVar6;
        }
        if (objectInput.readBoolean()) {
            o2d o2dVar7 = new o2d();
            o2dVar7.readExternal(objectInput);
            this.Q = true;
            this.R = o2dVar7;
        }
        if (objectInput.readBoolean()) {
            o2d o2dVar8 = new o2d();
            o2dVar8.readExternal(objectInput);
            this.S = true;
            this.T = o2dVar8;
        }
        if (objectInput.readBoolean()) {
            o2d o2dVar9 = new o2d();
            o2dVar9.readExternal(objectInput);
            this.U = true;
            this.V = o2dVar9;
        }
        if (objectInput.readBoolean()) {
            o2d o2dVar10 = new o2d();
            o2dVar10.readExternal(objectInput);
            this.W = true;
            this.X = o2dVar10;
        }
        if (objectInput.readBoolean()) {
            o2d o2dVar11 = new o2d();
            o2dVar11.readExternal(objectInput);
            this.Y = true;
            this.Z = o2dVar11;
        }
        if (objectInput.readBoolean()) {
            o2d o2dVar12 = new o2d();
            o2dVar12.readExternal(objectInput);
            this.a0 = true;
            this.b0 = o2dVar12;
        }
        if (objectInput.readBoolean()) {
            o2d o2dVar13 = new o2d();
            o2dVar13.readExternal(objectInput);
            this.c0 = true;
            this.d0 = o2dVar13;
        }
        if (objectInput.readBoolean()) {
            o2d o2dVar14 = new o2d();
            o2dVar14.readExternal(objectInput);
            this.e0 = true;
            this.f0 = o2dVar14;
        }
        if (objectInput.readBoolean()) {
            o2d o2dVar15 = new o2d();
            o2dVar15.readExternal(objectInput);
            this.g0 = true;
            this.h0 = o2dVar15;
        }
        if (objectInput.readBoolean()) {
            o2d o2dVar16 = new o2d();
            o2dVar16.readExternal(objectInput);
            this.i0 = true;
            this.j0 = o2dVar16;
        }
        if (objectInput.readBoolean()) {
            o2d o2dVar17 = new o2d();
            o2dVar17.readExternal(objectInput);
            this.k0 = true;
            this.l0 = o2dVar17;
        }
        w(objectInput.readUTF());
        this.n0 = objectInput.readInt();
        x(objectInput.readUTF());
        if (objectInput.readBoolean()) {
            String utf = objectInput.readUTF();
            this.p0 = true;
            this.q0 = utf;
        }
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.r0 = true;
            this.s0 = utf2;
        }
        if (objectInput.readBoolean()) {
            String utf3 = objectInput.readUTF();
            this.t0 = true;
            this.u0 = utf3;
        }
        if (objectInput.readBoolean()) {
            String utf4 = objectInput.readUTF();
            this.v0 = true;
            this.w0 = utf4;
        }
        if (objectInput.readBoolean()) {
            String utf5 = objectInput.readUTF();
            this.x0 = true;
            this.y0 = utf5;
        }
        this.z0 = objectInput.readBoolean();
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            l2d l2dVar = new l2d();
            l2dVar.readExternal(objectInput);
            this.A0.add(l2dVar);
        }
        int i3 = objectInput.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            l2d l2dVar2 = new l2d();
            l2dVar2.readExternal(objectInput);
            this.B0.add(l2dVar2);
        }
        this.C0 = objectInput.readBoolean();
        if (objectInput.readBoolean()) {
            String utf6 = objectInput.readUTF();
            this.D0 = true;
            this.E0 = utf6;
        }
        this.F0 = objectInput.readBoolean();
    }

    public final o2d s() {
        return this.b0;
    }

    public final o2d t() {
        return this.T;
    }

    public final boolean u() {
        return this.D0;
    }

    public final boolean v() {
        return this.t0;
    }

    public void w(String str) {
        this.m0 = str;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.E);
        if (this.E) {
            this.F.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.G);
        if (this.G) {
            this.H.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.I);
        if (this.I) {
            this.J.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.K);
        if (this.K) {
            this.L.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.M);
        if (this.M) {
            this.N.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.O);
        if (this.O) {
            this.P.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.Q);
        if (this.Q) {
            this.R.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.S);
        if (this.S) {
            this.T.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.U);
        if (this.U) {
            this.V.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.W);
        if (this.W) {
            this.X.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.Y);
        if (this.Y) {
            this.Z.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.a0);
        if (this.a0) {
            this.b0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.c0);
        if (this.c0) {
            this.d0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.e0);
        if (this.e0) {
            this.f0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.g0);
        if (this.g0) {
            this.h0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.i0);
        if (this.i0) {
            this.j0.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.k0);
        if (this.k0) {
            this.l0.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.m0);
        objectOutput.writeInt(this.n0);
        objectOutput.writeUTF(this.o0);
        objectOutput.writeBoolean(this.p0);
        if (this.p0) {
            objectOutput.writeUTF(this.q0);
        }
        objectOutput.writeBoolean(this.r0);
        if (this.r0) {
            objectOutput.writeUTF(this.s0);
        }
        objectOutput.writeBoolean(this.t0);
        if (this.t0) {
            objectOutput.writeUTF(this.u0);
        }
        objectOutput.writeBoolean(this.v0);
        if (this.v0) {
            objectOutput.writeUTF(this.w0);
        }
        objectOutput.writeBoolean(this.x0);
        if (this.x0) {
            objectOutput.writeUTF(this.y0);
        }
        objectOutput.writeBoolean(this.z0);
        ArrayList arrayList = this.A0;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((l2d) arrayList.get(i)).writeExternal(objectOutput);
        }
        ArrayList arrayList2 = this.B0;
        int size2 = arrayList2.size();
        objectOutput.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            ((l2d) arrayList2.get(i2)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.C0);
        objectOutput.writeBoolean(this.D0);
        if (this.D0) {
            objectOutput.writeUTF(this.E0);
        }
        objectOutput.writeBoolean(this.F0);
    }

    public void x(String str) {
        this.o0 = str;
    }
}
