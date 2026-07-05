package com.google.protobuf;

import defpackage.s34;

/* JADX INFO: loaded from: classes.dex */
public final class a extends s34 {
    public int G;
    public int H;
    public final int I;
    public final int J;
    public int K = Integer.MAX_VALUE;

    public a(byte[] bArr, int i, int i2, boolean z) {
        this.G = i2 + i;
        this.I = i;
        this.J = i;
    }

    public final int f(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int i2 = this.I;
        int i3 = this.J;
        int i4 = (i2 - i3) + i;
        if (i4 < 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int i5 = this.K;
        if (i4 > i5) {
            throw InvalidProtocolBufferException.e();
        }
        this.K = i4;
        int i6 = this.G + this.H;
        this.G = i6;
        int i7 = i6 - i3;
        int i8 = this.K;
        if (i7 > i8) {
            int i9 = i7 - i8;
            this.H = i9;
            this.G = i6 - i9;
        } else {
            this.H = 0;
        }
        return i5;
    }
}
