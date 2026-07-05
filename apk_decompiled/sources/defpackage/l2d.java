package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class l2d implements Externalizable {
    public boolean H;
    public boolean K;
    public String E = "";
    public String F = "";
    public final ArrayList G = new ArrayList();
    public String I = "";
    public boolean J = false;
    public String L = "";

    public final String a(int i) {
        return (String) this.G.get(i);
    }

    public final int b() {
        return this.G.size();
    }

    public final String c() {
        return this.I;
    }

    public final String d() {
        return this.E;
    }

    public final String getFormat() {
        return this.F;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        this.E = objectInput.readUTF();
        this.F = objectInput.readUTF();
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            this.G.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            String utf = objectInput.readUTF();
            this.H = true;
            this.I = utf;
        }
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.K = true;
            this.L = utf2;
        }
        this.J = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.E);
        objectOutput.writeUTF(this.F);
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutput.writeUTF((String) arrayList.get(i));
        }
        objectOutput.writeBoolean(this.H);
        if (this.H) {
            objectOutput.writeUTF(this.I);
        }
        objectOutput.writeBoolean(this.K);
        if (this.K) {
            objectOutput.writeUTF(this.L);
        }
        objectOutput.writeBoolean(this.J);
    }
}
