package com.wcdaren.tx;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class FooServiceImpl implements FooService {

	@Override
	public Foo getFoo(String fooName) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void insertFoo(Foo foo) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void updateFoo(Foo foo) {
		throw new UnsupportedOperationException();

	}

}
