import setuptools
import simple_network_pong

with open('requirements.txt') as fh:
    required = fh.read().splitlines()

with open('README.md', 'r') as fh:
    long_description = fh.read()

setuptools.setup(
    name='Simple Network Pong',
    version=simple_network_pong.__version__,
    author='Nicholas Dyer',
    description='A simple Python game of Pong to be played over the network.',
    license='GNU GPL-3.0',
    long_description=long_description,
    long_description_content_type='text/markdown',
    url='https://github.com/nickedyer/simple-network-pong',
    packages=setuptools.find_packages(),
    # https://pypi.org/classifiers/
    classifiers=[
    ],
    install_requires=required,
    python_requires='>=3.9',
    include_package_data=True,
)
