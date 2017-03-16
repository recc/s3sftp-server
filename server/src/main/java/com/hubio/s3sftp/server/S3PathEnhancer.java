/**
 * The MIT License (MIT)
 * Copyright (c) 2017 Hubio
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.hubio.s3sftp.server;

import com.upplication.s3fs.S3Path;

import java.util.function.Function;

/**
 * Function that modified an {@link S3Path}.
 *
 * @author Paul Campbell (paul.campbell@hubio.com)
 */
public interface S3PathEnhancer extends Function<S3Path, S3Path> {

    /**
     * Create an {@link S3PathEnhancer} that forces a fixed prefix.
     *
     * @param prefix The prefix
     *
     * @return the path enhancer
     */
    static S3PathEnhancer fixedPrefix(final String prefix) {
        return new FixedPrefixS3PathEnhancer(prefix);
    }
}
